package PAT;

import java.util.Scanner;


public class B_1013 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int [] result;
        if(m!=n){
            result=new int[n-m+1];
        } else{
            result=new int[1];
        }
        int p=1;
        int num=0;
        boolean flag=true;
        int ln=1;
        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                p++;
                if(p>m){
//                    System.out.print(i+" ");
                    result[num++]=i;
                    ln++;
                }
                if(p>n){
                    break;
                }
            }
            flag=true;
//            if(ln%10==0){
//                System.out.println();
//            }
        }

        for (int i = 1; i < result.length; i++) {
            System.out.print(result[i-1]+" ");
            if(i%10==0){
                System.out.print("\b");
                System.out.println();
            }

        }
        System.out.print(result[result.length-1]);
//        System.out.print("\b");
    }
}
