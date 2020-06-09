package PAT;

import java.util.Scanner;

class B_1007{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        boolean[] flag=new boolean[100000];

        int n=in.nextInt();
        for (int i = 2; i < n/2+1; i++) {
            for (int j = 2; j*i <= n; j++) {
                flag[i*j]=true;
            }
        }

        for (int i = 0; i < n; i++) {
            if(!flag[i]){
                System.out.print(i-1+" ");
            }
        }
    }
}