package iMESContest;

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        A a = new A();
        int[] test = new int[]{0,0,0,4};
        System.out.println(a.distributeCandies(test));;
    }

    public int distributeCandies(int[] candies) {

        int len = candies.length;

        ArrayList list = new ArrayList();


        for (int i = 0; i < candies.length; i++) {
            if (!list.contains(candies[i])) {
                list.add(candies[i]);
            }
        }
        return Math.min(len / 2, list.size());
    }

}
