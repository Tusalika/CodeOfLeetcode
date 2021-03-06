package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root!=null){
            Queue<TreeNode> queue=new LinkedList<TreeNode>();
            queue.add(root);
            int level=0;
            while (!queue.isEmpty()){
                res.add(new ArrayList<Integer>());

                int level_length=queue.size();
                for (int i = 0; i < level_length; i++) {
                    TreeNode node=queue.remove();
                    res.get(level).add(node.val);
                    if(node.left!=null) queue.add(node.left);
                    if(node.right!=null) queue.add(node.right);
                }
                level++;
            }
        }
        return res;
    }
}
