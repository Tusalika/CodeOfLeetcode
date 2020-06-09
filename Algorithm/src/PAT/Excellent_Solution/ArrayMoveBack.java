package PAT.Excellent_Solution;

import java.util.Scanner;

/**
 * @author H2410780
 * @title: ArrayMoveBack
 * @projectName Algorithm
 * @description: TODO
 * @date 2019/6/19下午 04:05
 */
public class ArrayMoveBack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        m=m%n;//这里是细节,移动位置大于数组长度
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        if (n == m) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.print(a[n - 1]);
        } else {
            for (int i = n - m; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            for (int i = 0; i < n - m - 1; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.print(a[n - m - 1]);
        }

    }
}
