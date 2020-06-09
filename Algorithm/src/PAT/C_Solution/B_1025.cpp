#include<stdio.h>
#include<stack>
#include<queue>
using namespace std;
const int maxn=100000;           //定义最大链表结点数
struct node
{
    int address,data,next;       //结点结构体，成员有地址address，数据域data，指针域next
} num[maxn];
int main()
{
    int address,begin,n,k;       //临时存放结点地址的address，存放首地址的begin，结点数n，逆转结点数k
    stack<node> s;               //临时存放逆转结点的栈
    queue<node> q;               //存放逆转后的序列
    scanf("%d%d%d",&begin,&n,&k);//读入
    for(int i=0; i<n; i++)
    {
        scanf("%d%",&address);
        num[address].address =address;
        scanf("%d%d",&num[address].data,&num[address].next);     //读入每个结点的信息
    }
    int p=begin,cnt=0,count=0;     //p为工作指针，cnt记录当前已经进入栈中的逆转结点数。count记录有效结点数
    while(p!=-1)
    {
        count++;
        p=num[p].next;             //遍历链表统计结点个数
    }
    p=begin;                      //p指针回到首位
    for(int i=1; i<=count/k; i++) //逆转次数，循环
    {
        while(cnt!=k*i)           //只要需要逆转的结点数没到时
        {
            cnt++;
            s.push(num[p]);       //入栈
            p=num[p].next;
        }
        if(cnt==k*i)              //本次逆转完毕
        {
            while(!s.empty())
            {
                q.push(s.top());  //将栈中所有的元素输出到队列中
                s.pop();
            }
        }
    }
    while(p!=-1)                //把链表中剩余的不许逆转的结点入队列
    {
        q.push(num[p]);
        p=num[p].next ;
    }
    while(!q.empty())          //输出
    {
        node temp;
        temp=q.front();
        q.pop();
        temp.next =q.front().address;    //按照逆转后的新顺序，更新结点的next
        if(q.size()>=1)
        {
            printf("%05d %d %05d\n",temp.address,temp.data,temp.next);
        }
        else
        {
            temp.next =-1;              //最后一个结点要特别判断
            printf("%05d %d %d\n",temp.address,temp.data,temp.next);
        }
    }
    return 0;

}
