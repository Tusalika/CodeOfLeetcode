package util;


public class findPrime {
    public static void main(String[] args) {
        int num=0;
        boolean flag=true;
        int n=1;
        for (int i = 2; i < 100000; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+",");
            }
            flag=true;
            if(i%300==0){
                System.out.println();
            }
        }
    }
}
