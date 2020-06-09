package LeetCodeDaily;

public class June02_SumN {

    public int sumNums(int n) {
//        return n == 0 ? 0 : n + sumNums(n - 1);
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}
