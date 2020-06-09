package test;

import java.math.BigDecimal;


public class test2 {
    public static void main(String[] args) {
        BigDecimal a=new BigDecimal(123);
        BigDecimal b=new BigDecimal(1.4f);
        BigDecimal c=new BigDecimal("1.3");
        System.out.println(a.toString());
        System.out.println(b.byteValueExact());
        System.out.println(c.toString());
    }
}
