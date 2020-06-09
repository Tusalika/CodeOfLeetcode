package iMESContest;

public class T2 {
    public static void main(String[] args) {
        T2 t2 = new T2();
        System.out.println(t2.isHappy(101));
    }

    public boolean isHappy(int n) {
        int sum = -1;
        try {
            while (sum >10) {
                sum = 0;
                while (n > 0) {
                    sum += (n % 10) * (n % 10);
                    n /= 10;
                }
                n = sum;
            }
        } catch (Error e) {
            return false;
        }
        return true;
    }
}
