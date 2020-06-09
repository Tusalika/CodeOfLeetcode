package PAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B_1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.valueOf(in.readLine());
        char c=in.readLine().charAt(0);
        if(n == 1){
            System.out.printf("%c\n0\n", c);
        }
        int rest = n, max = 0;
        for(int i = 1; rest >= 2 * i; i += 2){
            if(i == 1){
                rest -= i;
            }
            else{
                rest -= (2 * i);
                max = i;
            }
        }
        if(n < 7){
            System.out.printf("%c\n", c);
        }
        int blank = 0;
        for(int j = max; j > 0; j -= 2, ++blank){
            for(int k = 0; k < blank; ++k){
                System.out.printf("%c", ' ');
            }
            for(int l = 0; l < j; ++l){
                System.out.printf("%c", c);
            }
            System.out.printf("%c", '\n');
        }
        blank -= 2;
        for(int m = 3; blank >= 0; --blank, m += 2){
            for(int s = 0; s < blank; ++s){
                System.out.printf("%c", ' ');
            }
            for(int o = 0; o < m; ++o){
                System.out.printf("%c", c);
            }
            System.out.printf("%c", '\n');
        }
        System.out.printf("%d\n", rest);
    }
}
