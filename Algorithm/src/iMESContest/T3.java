package iMESContest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T3 {
    public static void main(String[] args) {
        T3 t3=new T3();
        int [] a=new int []{3,8,-10,23,19,-4,-14,27};
        System.out.println(t3.minimumAbsDifference(a));
    }
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i ++) {
            for (int j = i + 1; j < arr.length; j ++) {
                List<Integer> list = new ArrayList<>();
                int minus = Math.abs(arr[i] - arr[j]);
                list.add(arr[i]);
                list.add(arr[j]);

                List<List<Integer>> minusList = map.get(minus);
                if(minusList == null) {
                    minusList = new ArrayList<>();
                }
                minusList.add(list);
                map.put(minus, minusList);

                min = min < minus ? min : minus;
            }
        }

        return map.get(min);
    }
}
