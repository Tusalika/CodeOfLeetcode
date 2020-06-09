package PAT;


import java.math.BigInteger;
import java.util.Scanner;
//A=B×Q+R
public class B_1017 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String A=in.next();
        int B=in.nextInt();
//        String Q;
        char [] AChar=A.toCharArray();
        int [] AInt=new int[AChar.length+1];
        char quotient[]=new char[1000];
        int rest=0;

        for (int i = 0; i < AChar.length; i++) {
            quotient[i]=(char)(((rest*10+AChar[i]-'0')/B)+'0');
            rest=(rest*10+(AChar[i]-48))%B;
        }

        if(quotient[0] == '0' && quotient[1] != 0){
            for (int i=1;i<quotient.length;i++){
                System.out.print(quotient[i]);
            }
        }
        else{
            System.out.printf("%s", quotient);
        }
        System.out.printf(" %d\n", rest);

//        for (int i = 0; i < AInt.length-1; i++) {
//            if(AInt[i]<B){
//                AInt[i]+=10;
//                AInt[i+1]-=1;
//            }
//        }
    }
}

/*
int main()
{
    char a[1000];
    int b;
    scanf("%s %d", a, &b);
    char quotient[1000]; //商
    int rest = 0; //余数
    for(int i = 0; i != strlen(a); i++){
        quotient[i] = ((rest * 10 + a[i] - 48) / b) + 48;
        rest = (rest * 10 + (a[i] - 48)) % b;
    }
    if(quotient[0] == '0' && quotient[1] != 0){
        printf("%s", quotient + 1);
    }
    else{
        printf("%s", quotient);
    }
    printf(" %d\n", rest);
    return 0;
}
* */