package PAT;

import java.util.Scanner;

/**
 * @author H2410780
 * @title: B_1006
 * @projectName Algorithm
 * @description: TODO
 * @date 2019/6/3下午 07:39
 */
public class B_1006 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n<10){
            for (int i = 1; i <=n; i++) {
                System.out.print(i);
            }
        }else if(n<100){
            int s=n/10;
            int g=n%10;
            for (int i = 0; i < s; i++) {
                System.out.print('S');
            }
            for (int i = 1; i <=g; i++) {
                System.out.print(i);
            }
        }else if(n<1000){
            int B=n/100;
            int s=(n%100)/10;
            int g=n%10;
            for (int i = 0; i < B; i++) {
                System.out.print('B');
            }
            for (int i = 0; i < s; i++) {
                System.out.print('S');
            }
            for (int i = 1; i <=g; i++) {
                System.out.print(i);
            }
        }
    }
}
