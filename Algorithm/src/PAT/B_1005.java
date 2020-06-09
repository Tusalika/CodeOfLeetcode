package PAT;

import java.util.*;

/**
 * @author H2410780
 * @title: B_1005
 * @projectName Algorithm
 * @description: TODO
 * @date 2019/5/30下午 03:36
 */
public class B_1005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        boolean[] flag = new boolean[10000];
        int a[] = new int[n];
        //int [] recoder=new int [];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            int nn = a[i];
            while (nn != 1) {
                if (nn % 2 == 0) {
                    nn = nn / 2;
                    if (flag[nn]) {
                        break;
                    }
                    flag[nn] = true;
                } else {
                    nn = (nn * 3 + 1) / 2;
                    if (flag[nn]) {
                        break;
                    }
                    flag[nn] = true;
                }
                count++;
            }
        }
        List<Integer> list=new ArrayList<Integer>();
    }
}
