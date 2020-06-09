package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_78_SubSet {
    public static void main(String[] args) {
        Leetcode_78_SubSet s =new Leetcode_78_SubSet();
        int [] a = new int[]{1,2,3,4};
        s.subsets(a);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null) {
            return ans;
        }
        dfs(ans, nums, new ArrayList<Integer>(), 0);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, int[] nums, List<Integer> list, int index) {

        if (index == nums.length) {
            ans.add(new ArrayList<Integer>(list));
        }

        dfs(ans, nums, list, index + 1);
        list.add(nums[index]);
//        dfs(ans, nums, list.clone(), index + 1);

        list.remove(list.size() - 1);
    }


}
