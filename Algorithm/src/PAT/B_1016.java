package PAT;


import java.util.Scanner;

public class B_1016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countA = 0;
        int countB = 0;
        String A = in.next();
        int DA = in.nextInt();
        String B = in.next();
        int DB = in.nextInt();

        String RA = "", RB = "";

        char[] AChar = A.toCharArray();
        char[] BChar = B.toCharArray();

        for (int i = 0; i < AChar.length; i++) {
            if (AChar[i] - '0' == DA) {
                countA++;
            }
        }

        for (int i = 0; i < BChar.length; i++) {
            if (BChar[i] - '0' == DB) {
                countB++;
            }
        }

//        System.out.println(countA+" "+countB);
        for (int i = 0; i < countA; i++) {
            RA = RA + DA;
        }
        for (int i = 0; i < countB; i++) {
            RB = RB + DB;
        }

        if (countA == 0 && countB == 0) {
            System.out.println(0);
        } else if (countA == 0 && countB != 0) {
            System.out.println(Integer.valueOf(RB));
        } else if (countB == 0 && countA != 0) {
            System.out.println(Integer.valueOf(RA));
        } else {
            System.out.println(Integer.valueOf(RA) + Integer.valueOf(RB));
        }
    }
}
