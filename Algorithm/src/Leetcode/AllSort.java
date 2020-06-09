package Leetcode;

import java.util.LinkedList;
import java.util.List;

public class AllSort {
    List<List<Integer>> res= new LinkedList<>();

    List<List<Integer>> permute(int [] nums){
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(nums,track);
        return res;
    }

    private void backtrack(int[] nums, LinkedList<Integer> track) {
        if(track.size()==nums.length){
            res.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(track.contains(nums[i]))
                continue;
            track.addLast(nums[i]);

            backtrack(nums,track);

            track.removeLast();
        }
    }

    void allSort(){

    }
}
