package PAT;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author H2410780
 * @title: B_1004
 * @projectName Algorithm
 * @description: TODO
 * @date 2019/5/30上午 11:56
 */
public class B_1004 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        //List<Student> students=new ArrayList<Student>();

        Student [] ss=new Student[n];

        for (int i = 0; i < n; ++i) {
            ss[i]=new Student();
            ss[i].name=(in.next());
            ss[i].No=(in.next());
            ss[i].score=(in.nextInt());

        }

        Arrays.sort(ss,new MyComprator());

        System.out.println(ss[ss.length-1].name+" "+ss[ss.length-1].No);
        System.out.println(ss[0].name+" "+ss[0].No);


    }
}

class Student {

    String name;
    String No;
    int score;


}
class MyComprator implements Comparator {
    public int compare(Object arg0, Object arg1) {
        Student t1=(Student)arg0;
        Student t2=(Student)arg1;
        if(t1.score != t2.score)
            return t1.score>t2.score? 1:-1;
        else
            return t1.score>t2.score? 1:-1;
    }
}
