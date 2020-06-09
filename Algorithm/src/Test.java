import java.util.ArrayList;

/**
 * @author H2410780
 * @title: Test
 * @projectName Algorithm
 * @description: TODO
 * @date 2019/6/3下午 02:25
 */
public class Test {
    public static void main(String[] args) {
        String ss="{{  d  sadasd[asd  da ds,dsad,a]dsad}}}";
        int beginPosition=ss.indexOf("[");
        int endPosition=ss.indexOf("]");
        System.out.println(beginPosition+"|"+endPosition);
        String subString=ss.substring(beginPosition,endPosition+1);
        System.out.println(subString);
    }
}

/*class test1{
    public void a(){
        System.out.println("this is a");
        b();
    }

    public void b(){
        System.out.println("this is b");
        a();
    }
}*/

/*
* ArrayList list=new ArrayList();
        for (int i = 0; i <10; i++) {
            list.add(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("indexOf:"+list.indexOf(i));
            System.out.println("get:"+list.get(i));
        }*/