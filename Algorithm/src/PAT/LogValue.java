package PAT;

import java.util.Scanner;


public class LogValue {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (true) {
            int a = cin.nextInt();
            int i = 0;
            while (a != 1) {
                if (a % 2 == 0) {
                    a = a / 2;
                    System.out.println(a);
                } else {
                    a = a * 3 + 1;
                    a = a / 2;
                    System.out.println(a);
                }
                i++;

            }
            System.out.println("------>" + i);
        }
    }
}
