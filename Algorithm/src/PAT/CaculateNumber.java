package PAT;

import java.util.Scanner;


public class CaculateNumber {
    public static void main(String[] args) {
        String [] pinyin={"ling","yi","er","san","si","wu","liu","qi","ba","jiu","shi"};
        Scanner cin=new Scanner(System.in);
        String s=cin.next();
        char [] n=s.toCharArray();
        int r;
        int sum=0;
        for (int i = 0; i <n.length; i++) {
            r=n[i]-'0';
            sum=sum+r;
        }
        String result=sum+"";
        char [] re=result.toCharArray();

        for (int i = 0; i <re.length-1; i++) {
            System.out.print(pinyin[re[i]-'0']);
            System.out.println(' ');
        }
        System.out.println(re[re.length-1]);
    }


}
