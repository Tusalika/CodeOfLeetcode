package test;

import java.util.ArrayList;
import java.util.List;

public class test5 {
    public static void main(String[] args) {
        A a=new A("zhangsan");
        List<A> aList=new ArrayList<>();
        aList.add(a);

        A a2=new A("zhangsan");
        System.out.println("aList:   "+aList);
        System.out.println(aList.contains(a2));
        System.out.println("a:   "+a);
    }
}

class A {

    public String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}