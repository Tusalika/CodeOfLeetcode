package test;

import java.awt.List;
import java.util.*;

public class number {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        int i = 0;
        int a = 232322;

        for (i = 0; i * i < a; i++) {
            list.add(i);
        }

        System.out.println(list);
    }

    int min(int a, int b) {
        if (a > b)
            return b;
        else
            return a;
    }

    int numSquares(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++)
            dp[i] = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; i + j * j <= n; j++) {
                dp[i + j * j] = min(dp[i] + 1, dp[i + j * j]);
            }
        }

        return dp[n];
    }
}
