package PAT;

import java.sql.SQLOutput;
import java.util.Scanner;

public class B_1022 {
    public static void main(String[] args) {
        int a;
        int b;
        int D;

        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        D=in.nextInt();
        System.out.println(Integer.toString(a+b,D));

    }

}
