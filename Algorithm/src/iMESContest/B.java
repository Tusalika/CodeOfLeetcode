package iMESContest;

import java.util.ArrayList;

public class B {
    public static void main(String[] args) {
        B  a = new B();
        System.out.println(a.isHappy(11));;
    }


    public boolean isHappy(int n) {
        String x = String.valueOf(n);
        System.out.println(x);

        while (x.length()>1){
            int b=0;
            for (int i=0;i<x.length();i++){
                b += (x.charAt(i)-'0')* (x.charAt(i)-'0');
                System.out.println(b);
            }
            x = String.valueOf(b);
        }
        return x.equals("1")||x.equals("7");
    }
}