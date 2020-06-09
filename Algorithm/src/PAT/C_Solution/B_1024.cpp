#include<cstdio>
#include<string>
#include<cstring>
using namespace std;

char input[10000];
int a1,a2;
int y=0;
int main(){

	scanf("%s",input);

	if(input[0]=='-'){
		printf("-");
	}

	for(int i=1 ;i<10000 ;i++){
		if(input[i]=='.'){
			a1 = i-1;	//整数部分位数
			break;
		}
	}

	for(int i=1 ;i<10000 ;i++){
		if(input[i]=='E'){
			a2 = i-a1-2;	//小数部分位数
		}
	}

	int count=1;
	for(int i=strlen(input)-1 ;i>a2+a1+2+1 ;i--){
		y += (input[i]-48)*count;	//指数大小
		count *= 10;
	}

    if(input[a2+3+a1]=='+'){	//一：指数为正
        if(y>=a2){	//1.1：指数大小>=小数部分位数（转变后无小数点）
            for(int i=1 ;i<a2+a1+2 ;i++){
                if(input[i]!='.'){
                    printf("%c",input[i]);
                }
            }
            for(int i=0 ;i<y-a2 ;i++){
                printf("0");
            }
            printf("\n");
        }else{	//1.2指数大小<小数部分位数（转变后有小数点）
            for(int i=1 ;i<a2+a1+2 ;i++){
                if(input[i]=='.'){
                    continue;
                }
                if(i==2+y+a1){
                    printf(".");
                }
                printf("%c",input[i]);
            }
        }
    }else{	//二：指数为负数
        if(y>=a1){	//2.1：指数绝对值大小>=整数部分位数（转变后需要添加0）
            printf("0.");
            for(int i=0 ;i<y-a1 ;i++){
                printf("0");
            }
            for(int i=1 ;i<a2+a1+2 ;i++){
                if(input[i]!='.'){
                    printf("%c",input[i]);
                }
            }
            printf("\n");
        }else{	//2.2：指数绝对值大小<整数部分位数（转变后不需要添加0）
            for(int i=1 ;i<a2+a1+2 ;i++){
                if(input[i]=='.'){
                    continue;
                }
                printf("%c",input[i]);
                if(i==a1-y){
                    printf(".");
                }
            }
        }
    }
}
