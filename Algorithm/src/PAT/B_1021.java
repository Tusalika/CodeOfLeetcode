package PAT;

import java.util.Scanner;

public class B_1021 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String ss=in.nextLine();
        char[] c=ss.toCharArray();
        if(c[0] != '-') {
            int[] count = new int[10];
            for (int i = 0; i < c.length; i++) {
                count[c[i]-48]++;
//                if (c[i] == '0') {
//                    count[c[i] - 48]++;
//                } else if (c[i] == '1') {
//                    count[c[i] - 48]++;
//                } else if (c[i] == '2') {
//                    count[c[i] - 48]++;
//                } else if (c[i] == '3') {
//                    count[c[i] - 48]++;
//                } else if (c[i] == '4') {
//                    count[c[i] - 48]++;
//                } else if (c[i] == '5') {
//                    count[c[i] - 48]++;
//                } else if (c[i] == '6') {
//                    count[c[i] - 48]++;
//                } else if (c[i] == '7') {
//                    count[c[i] - 48]++;
//                } else if (c[i] == '8') {
//                    count[c[i] - 48]++;
//                } else {
//                    count[c[i] - 48]++;
//                }
            }
            for (int j = 0; j < 10; j++) {
                if (count[j] != 0) {
                    System.out.println(j + ":" + count[j]);
                }
            }
        }
    }
}
