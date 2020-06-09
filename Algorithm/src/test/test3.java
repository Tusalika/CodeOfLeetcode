package test;

import java.sql.SQLOutput;

//此class用于测试String各个内置函数
public class test3 {
    public static void main(String[] args) {
        String s="+123.465600E-10";
        char [] a=s.toCharArray();
        int a1=s.indexOf('.');
        int a2=s.indexOf('E');
        System.out.println("s.length():"+s.length()+"|||| a.length:"+a.length);
        for (int i = 0; i < s.length(); i++) {
            if(a[i]=='.'){
                System.out.println("s.indexOf('.'):"+a1+"||||i:"+i);
            }
        }
    }
}
/*
*         char b='5';


        int number=12;

        char []c=String.format("%04d", number).toCharArray();

//        System.out.println(c);
        String s="000123";
        System.out.println(Integer.valueOf(s));*/