package PAT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class stu implements Comparable<stu>
{
    int zkz;
    int de;
    int cai;
    int ji;//对学生进行分级

    public int compareTo(stu s)
    {
        if(this.ji < s.ji)
            return -1;
        else if(this.ji > s.ji)
            return 1;
        else//处于同一等级时的操作方式
        {
            if(this.de + this.cai > s.de + s.cai)
                return -1;
            else if(this.de + this.cai < s.de + s.cai)
                return 1;
            else//德才总分相同时
            {
                if(this.de > s.de)
                    return -1;
                else if(this.de < s.de)
                    return 1;
                else//德分相同时按准考证号升序排序
                {
                    if(this.zkz < s.zkz)
                        return -1;
                    else if(this.zkz > s.zkz)
                        return 1;
                    else
                        return 0;
                }
            }

        }
    }
}
public class B_1015_c {
    public static void main(String[] args)
    {

        int N,L,H;
        Scanner input=new Scanner (System.in);
        N=input.nextInt();
        L=input.nextInt();
        H=input.nextInt();
        stu m[]=new stu[N];
        int s=0;//记录及格的总人数
        for(int i=0;i<N;i++)
        {
            stu temp=new stu();
            temp.zkz=input.nextInt();
            temp.de=input.nextInt();
            temp.cai=input.nextInt();
            if(temp.de >= H && temp.cai >= H)//判断等级
                temp.ji = 1;
            else if(temp.de >= H && temp.cai >= L)
                temp.ji = 2;
            else if(temp.de >= L && temp.cai >= L && temp.de >= temp.cai)
                temp.ji = 3;
            else if(temp.de >= L && temp.cai >= L)
                temp.ji = 4;
            else
                temp.ji = 5;

            if(temp.ji != 5)
                s++;

            m[i]=temp;
        }
        Arrays.sort(m);
        System.out.println(s);
        for(stu item:m)
        {
            if(item.ji==5)
                continue;
            System.out.println(item.zkz+" "+item.de+" "+item.cai);
        }
    }
}
