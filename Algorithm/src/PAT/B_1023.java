package PAT;

import java.util.Scanner;

public class B_1023 {
    public static void main(String[] args) {
        int a[]=new int[10];
        String result="";
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i]=in.nextInt();
        }
        if(a[0]!=0){
            for (int i = 1; i < a.length; i++) {
                if(a[i]!=0){
                    result+=i;
                    a[i]-=1;
                    break;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=0){
                for (int j = 0; j < a[i]; j++) {
                    result+=i;
                }
            }
        }
        if (!"".equals(result)){
            System.out.println(result);
        }else {
            System.out.println(0);
        }
    }
}
