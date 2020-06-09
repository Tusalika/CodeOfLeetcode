package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode_01_2sum {
    public int [] twoSum(int [] nums,int target){
        int [] res=new int [2];
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i!=j&&nums[i] +nums[j]==target) {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }


    public int [] twoSumWithHashMap(int [] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                return new int []{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
