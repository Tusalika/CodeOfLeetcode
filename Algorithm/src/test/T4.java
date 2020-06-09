package test;

import java.util.Scanner;

class T4 {
    public static void main(String[] args) {
        while (true){
            System.out.println("输入0--10000内的数字求和");
            Scanner in = new Scanner(System.in);
            int sum = 0, n;
            n = in.nextInt();
            for (int i = 0; i <= n; ++i)
                sum += i;
            System.out.println(sum);
        }
    }
}
