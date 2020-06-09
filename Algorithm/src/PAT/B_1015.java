package PAT;

import java.util.*;

public class B_1015 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();//总数
        int L = in.nextInt();//最低录取线
        int H = in.nextInt();//优先录取线
        int type = 0;
        int count = 0;

        int sTable[][] = new int[N][4];//二维数组,依次为 学号，德分，才分，以及类型
        for (int i = 0; i < N; i++) {
            int sno = in.nextInt();
            int de = in.nextInt();
            int cai = in.nextInt();
            sTable[i][0] = sno;
            sTable[i][1] = de;
            sTable[i][2] = cai;
            if (de >= L && cai >= L) {
                if (de >= H && cai >= H) {
                    type = 1;
                } else if (de >= H && cai < H) {
                    type = 2;
                } else if (de < H && cai < H && de >= cai) {
                    type = 3;
                } else {
                    type = 4;
                }
            } else {
                count++;
            }
            sTable[i][0] = sno;
            sTable[i][1] = de;
            sTable[i][2] = cai;
            sTable[i][3] = type;
        }

        System.out.println("================================");
        for (int i = 0; i < N; i++) {
            System.out.println(sTable[i][0] + " " + sTable[i][1] + " " + sTable[i][2] + " " + sTable[i][3]);
        }
//        Arrays.sort();

        for (int i = 0; i < N; i++) {

        }

        System.out.println("*********************************");
        for (int i = 0; i < N; i++) {
            System.out.println(sTable[i][0] + " " + sTable[i][1] + " " + sTable[i][2] + " " + sTable[i][3]);
        }
    }
}

