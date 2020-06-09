package PAT;

import java.util.Scanner;

public class B_1014 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sa = in.next();
        String sb = in.next();
        String sc = in.next();
        String sd = in.next();

        char week=' ';
        char hour=' ';
        char[] a = sa.toCharArray();
        char[] b = sb.toCharArray();
        char[] c = sc.toCharArray();
        char[] d = sd.toCharArray();
        int equals=1;
        int minute=0;
        int len1 = (a.length > b.length) ? b.length : a.length;
        for (int i = 0; i < len1; i++) {
            if (equals == 1) {
                if (a[i] >= 'A' && a[i] <= 'G' && b[i] >= 'A' && b[i] <= 'G') {
                    if (a[i] == b[i]) {
                        week = a[i];
                        equals++;
                    }
                }
            } else if (equals == 2) {
                if ((a[i] >= '0' && a[i] <= '9' || a[i] >= 'A' && a[i] <= 'N') && (b[i] >= '0' && b[i] <= '9' || b[i] >= 'A' && b[i] <= 'N')) {
                    if (a[i] == b[i]) {
                        hour = a[i];
                        break;
                    }
                }
            }
        }

        int len2=(c.length>d.length)? d.length:c.length;
        for (int j = 0; j < len2; j++) {
            if((c[j] >= 'a' && c[j] <= 'z' || c[j] >= 'A' && c[j] <= 'Z') && (d[j] >= 'a' && d[j] <= 'z' || d[j] >= 'A' && d[j] <= 'Z')){
                if(c[j]==d[j]){
                    minute=j;
//                    System.out.println("i="+minute);
//                    System.out.println("minute="+minute);
                    break;
                }
            }
        }
        switch(week){
            case 'A': System.out.printf("MON ");break;
            case 'B': System.out.printf("TUE ");break;
            case 'C': System.out.printf("WED ");break;
            case 'D': System.out.printf("THU ");break;
            case 'E': System.out.printf("FRI ");break;
            case 'F': System.out.printf("SAT ");break;
            case 'G': System.out.printf("SUN ");break;
        }
        if(hour >= '0' && hour <= '9'){
            System.out.printf("0%c:", hour);
        }
        else if(hour >= 'A' && hour <= 'N'){
            switch(hour){
                case 'A': System.out.printf("10:");break;
                case 'B': System.out.printf("11:");break;
                case 'C': System.out.printf("12:");break;
                case 'D': System.out.printf("13:");break;
                case 'E': System.out.printf("14:");break;
                case 'F': System.out.printf("15:");break;
                case 'G': System.out.printf("16:");break;
                case 'H': System.out.printf("17:");break;
                case 'I': System.out.printf("18:");break;
                case 'J': System.out.printf("19:");break;
                case 'K': System.out.printf("20:");break;
                case 'L': System.out.printf("21:");break;
                case 'M': System.out.printf("22:");break;
                case 'N': System.out.printf("23:");break;
            }
        }
        System.out.printf("%02d\n", minute);
    }
}
/*
3485djDkxh4hhGE
2984akDfkkkkggEdsb
s&hgsfdk
d&Hyscvnm


 */


/*
*
3485djDkxh4hhGE
2984akDfkkkkggEdsb
s&hsdagsfdk
d&Hdslyscvnm
* */
