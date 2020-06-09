package iMESContest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T6 {

    public static void main(String[] args) {
        T6 a = new T6();
        System.out.println(a.addToArrayForm(new int[]{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3},1));;
    }
    public List<Integer> addToArrayForm(int[] A, int K) {
        StringBuilder aa=new StringBuilder();
        for (int i = 0; i < A.length; i++) {
            aa.append(A[i]);
        }

        Long first=Long.valueOf(aa.toString());
        String res=first+K +"";
        char [] tmp=res.toCharArray();
        ArrayList list = new ArrayList();
        for (int i = 0; i < tmp.length; i++) {
            list.add(tmp[i]-'0');
        }
        return list;
    }

    public List<Integer> addToArrayFormOfficial(int[] A, int K) {
        int N = A.length;
        int cur = K;
        List<Integer> ans = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += A[i];
            ans.add(cur % 10);
            cur /= 10;
        }

        Collections.reverse(ans);
        return ans;
    }


}
