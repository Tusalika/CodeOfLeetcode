package Leetcode;

import test.subString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Leetcode_15_3sum {
    public static void main(String[] args) {
        Leetcode_15_3sum ss = new Leetcode_15_3sum();
        Scanner in = new Scanner(System.in);

        while (true) {
            int n = in.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }


            System.out.println(ss.threeSum(a));
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (nums == null || len < 3) return res;
        Arrays.sort(nums);
//        else if(nums.length==3&&nums[0]==0){
//            if(nums[0]+nums[1]+nums[2]==0) res.add(Arrays.asList(0,0,0));
//        }
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (nums[i] + nums[l] + nums[r] == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    l++;
                    r--;
                } else if (sum < 0) l++;
                else if (sum > 0) r--;
            }
        }
        return res;
    }
}
