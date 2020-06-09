package Leetcode;

import test.subString;

import java.util.Scanner;

public class Leetcode_70_ClimbingStairs {

    public static void main(String[] args) {
        Leetcode_70_ClimbingStairs ss = new Leetcode_70_ClimbingStairs();
        Scanner in = new Scanner(System.in);

        while (true) {
            int s = in.nextInt();
            System.out.println(ss.climbStairsUseRecursion(s));
        }
    }

    public int climbStairsUseRecursion(int n){
        int memo[]=new int[n+1];
        return climb_stairs(0,n,memo);
    }

    private int climb_stairs(int i, int n, int[] memo) {
        if (i>n){
            return 0;
        }
        if(i==n){
            return 1;
        }
        if(memo[i]>0){
            return memo[i];
        }
        memo[i]=climb_stairs(i+1,n,memo)+climb_stairs(i+2,n,memo);
        return memo[i];
    }

    public int climbStairsUseDynamicPlan(int n){
        if(n==1){
            return 1;
        }

        int [] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i < n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

}
