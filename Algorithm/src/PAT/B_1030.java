package PAT;

import java.util.Arrays;
import java.util.Scanner;

public class B_1030 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int p=in.nextInt();
        int [] a=new int [N];
        for (int i = 0; i < N; i++) {
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        for (int i = N-1; i>0; i--) {
            if(a[i]<=a[0]*p){
                System.out.println(i+1);
                break;
            }
        }
    }
}
