package PAT;

import java.util.Scanner;

public class B_1013_b {

    public static boolean isPrimeNumber(int n, int[] PNarray) {
        for (int i = 0; PNarray[i] * PNarray[i] <= n; i++) {
            if (n % PNarray[i] == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int PNarray[] = new int[10000];
        PNarray[0] = 2;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int index = 1;
        for (int i = 3; index < b; i += 2) { //建立到第b个数的素数表
            if (isPrimeNumber(i, PNarray)) { //is prime number
                PNarray[index++] = i; //store in prime number table
            }
        }


        int count = 0;
        for(int j = a - 1; j < b; j++){
            if(count % 10 != 0){
                System.out.printf("%c", ' ');
            }
            System.out.printf("%d", PNarray[j]);
            count++;
            if(count % 10 == 0){
                System.out.printf("%c", '\n');
            }
        }
        if(count % 10 != 0){
            System.out.printf("%c", '\n');
        }
    }
}
