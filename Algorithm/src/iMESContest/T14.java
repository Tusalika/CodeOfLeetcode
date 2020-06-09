package iMESContest;

import java.util.ArrayList;
import java.util.Arrays;

public class T14 {
    public static void main(String[] args) {
        int [] [] test=new int [] []{{1,2},{2,3},{3,4},{4,5},{5,6},{5,5},{6,7},{7,8}};// [[5,4],[6,4],[6,7],[2,3]]
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j]+" ");
            }
            System.out.println();
        }
//        Arrays.sort(test);
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j]+" ");
            }
            System.out.println();
        }

        T14 t14 = new T14();
        System.out.println(t14.maxEnvelopes(test));

    }

    public int maxEnvelopes(int[][] envelopes) {
        int [] tmp=new int[envelopes.length];
        int [] tmp2=new int[envelopes.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < envelopes.length; i++) {
            tmp[i]=envelopes[i][0];
            tmp2[i]=envelopes[i][1];

        }
        Arrays.sort(tmp);
        int [] [] tmpRes=new int[envelopes.length][2];
        for (int i = 0; i <tmp.length; i++) {
            for (int j = 0; j < envelopes.length; j++) {
                if (tmp[i] == envelopes[j][0])
                    tmpRes[i] = envelopes[j];
            }
        }
        int count =0;
        int[] a = new int[] {0,0};
        for (int k = 0; k < tmpRes.length; k++) {
            if (tmpRes[k][0]>a[0]&&tmpRes[k][1]>a[1]){
                count ++;
                a = tmpRes[k];
            }
        }
        return  count;

    }

}
