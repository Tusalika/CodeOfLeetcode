package PAT.Excellent_Solution;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberClassify {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] arrayS = s.split(" ");
        int capacity = 0;
        try {
            capacity = Integer.valueOf(arrayS[0]);
        } catch (Exception e) {
            System.exit(0);
        }
        if (capacity < 1 || capacity > 1000) {
            System.exit(0);
        }
        int tmp = 0;
        int A1 = 0, A2 = 0, A3 = 0, A5 = 0, countA4 = 0, sumA4 = 0, j = 0;
        boolean existA2 = false;
        for (int i = 0; i < capacity; i++) {
            try {
                tmp = Integer.valueOf(arrayS[i+1]);
            } catch (Exception e) {
                System.exit(0);
            }
            if (tmp < 1 || tmp > 1000) {
                System.exit(0);
            }
            if (tmp % 10 == 0) {
                A1 += tmp;
            } else if (tmp % 5 == 1) {
                A2 += tmp * (int) Math.pow(-1, j);
                existA2 = true;
                j++;
            } else if (tmp % 5 == 2) {
                A3++;
            } else if (tmp % 5 == 3) {
                sumA4 += tmp;
                countA4++;
            } else if (tmp % 5 == 4) {
                A5 = A5 > tmp ? A5 : tmp;
            }
        }
        if (A1 != 0) {
            System.out.print(A1 + " ");
        } else {
            System.out.print("N ");
        }
        if (existA2) {
            System.out.print(A2 + " ");
        } else {
            System.out.print("N ");
        }
        if (A3 != 0) {
            System.out.print(A3 + " ");
        } else {
            System.out.print("N ");
        }
        if (countA4 != 0) {
            double avg = (double) sumA4 / countA4;
            System.out.print(Math.round(avg * 10) / 10.0 + " ");
        } else {
            System.out.print("N ");
        }
        if (A5 != 0) {
            System.out.println(A5);
        } else {
            System.out.println("N");
        }
    }
}
