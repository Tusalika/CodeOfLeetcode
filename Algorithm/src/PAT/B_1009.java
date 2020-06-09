package PAT;


import java.util.Scanner;

/**
 * @author H2410780
 * @title: B_1009
 * @projectName Algorithm
 * @description: TODO
 * @date 2019/6/11下午 02:38
 */
public class B_1009 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String test=in.nextLine();
        String a[]=test.split(" ");
        for (int i = a.length; i >1; i--) {
            System.out.print(a[i-1]+" ");
        }
        System.out.print(a[0]);
    }
}
