package PAT;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
+1.23400E-03
0.00123400

-1.2E+10
-12000000000
*/
public class B_1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        char input[] = s.toCharArray();
        int a1=0;//整数位数
        int a2=0;//小数位数
        int y=0;//指数大小

        if(input[0]=='-')
        {
            System.out.printf("-");
        }

//        for(int i=1 ; i<input.length ; i++)
//        {
//            if(input[i]=='.')
//            {
//                a1 = i-1;	//整数部分位数
//                break;
//            }
//        }
        a1=s.indexOf('.')-1;

//        for(int i=1 ; i<input.length ; i++)
//        {
//            if(input[i]=='E')
//            {
//                a2 = i-a1-2;	//小数部分位数
//            }
//        }

        a2=s.indexOf('E')-a1-2;

        int count=1;
        for(int i=input.length-1 ; i>a2+a1+2+1 ; i--)
        {
            y += (input[i]-48)*count;	//指数大小
            count *= 10;
        }

        if(input[a2+3+a1]=='+') 	//一：指数为正
        {
            if(y>=a2) 	//1.1：指数大小>=小数部分位数（转变后无小数点）
            {
                for(int i=1 ; i<a2+a1+2 ; i++)
                {
                    if(input[i]!='.')
                    {
                        System.out.printf("%c",input[i]);
                    }
                }
                for(int i=0 ; i<y-a2 ; i++)
                {
                    System.out.printf("0");
                }
                System.out.printf("\n");
            }
            else 	//1.2指数大小<小数部分位数（转变后有小数点）
            {
                for(int i=1 ; i<a2+a1+2 ; i++)
                {
                    if(input[i]=='.')
                    {
                        continue;
                    }
                    if(i==2+y+a1)
                    {
                        System.out.printf(".");
                    }
                    System.out.printf("%c",input[i]);
                }
            }
        }
        else 	//二：指数为负数
        {
            if(y>=a1) 	//2.1：指数绝对值大小>=整数部分位数（转变后需要添加0）
            {
                System.out.printf("0.");
                for(int i=0 ; i<y-a1 ; i++)
                {
                    System.out.printf("0");
                }
                for(int i=1 ; i<a2+a1+2 ; i++)
                {
                    if(input[i]!='.')
                    {
                        System.out.printf("%c",input[i]);
                    }
                }
                System.out.printf("\n");
            }
            else 	//2.2：指数绝对值大小<整数部分位数（转变后不需要添加0）
            {
                for(int i=1 ; i<a2+a1+2 ; i++)
                {
                    if(input[i]=='.')
                    {
                        continue;
                    }
                    System.out.printf("%c",input[i]);
                    if(i==a1-y)
                    {
                        System.out.printf(".");
                    }
                }
            }
        }
    }
}
