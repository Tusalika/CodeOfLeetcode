package iMESContest;

import java.util.ArrayList;

public class T4 {
    public static void main(String[] args) {
        T4 a = new T4();
        System.out.println(a.processQueries(new int[]{7,5,5,8,3},8));;
    }

    public int[] processQueries(int[] queries, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] ans = new int[queries.length];
        for (int i = 0; i < m; i++) {
            list.add(i+1);
        }

        for (int j = 0; j < queries.length; j++) {
            for (int k = 0; k < list.toArray().length; k++) {
                if (list.get(k) == queries[j]){
                    list.remove(k);
                    list.add(0, queries[j]);
                    ans[j] = k;
                }
            }
        }
        return ans;
    }

}
