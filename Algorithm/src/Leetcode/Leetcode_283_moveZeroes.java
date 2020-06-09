package Leetcode;

public class Leetcode_283_moveZeroes {

    public void moveZero1(int [] nums){

    }


    public void moveZeros(int [] nums){
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[j]=nums[i];
                if(i!=j){
                    nums[i]=0;
                }
                j++;
            }
        }
    }
}

