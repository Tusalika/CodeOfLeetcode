package Leetcode;

public class Leetcode_50_Pow {
    public double myPow(double x, int n) {
        if (n < 0) return 1.0 / myPow(x, -n);
        double res = 1.0;

        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0) {
                res *= x;
            }
            x *= x;
        }
        return n < 0 ? 1 / res : res;
    }
}




//分治
