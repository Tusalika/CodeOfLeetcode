package Leetcode;

import java.util.LinkedList;

public class Leetcode_59_SlideWindowMaxValue {
    public int [] maxSlideWindow(int [] nums,int k){
        if(nums==null|| k<1||nums.length<k){
            return new int[0];
        }
        int index=0;
        int [] res=new int[nums.length-k+1];
        LinkedList<Integer> qMax=new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            while (!qMax.isEmpty()&& nums[qMax.peekLast()]<=nums[i]){
                qMax.pollLast();
            }

            qMax.addLast(i);
            if(qMax.peekLast()==(i-k)){
                qMax.pollFirst();
            }
            if(i>=(k-1)){
                res[index++]=nums[qMax.peekFirst()];
            }
        }
        return res;
    }
}
