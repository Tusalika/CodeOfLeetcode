package PAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_1028 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextInt());
        People people[] = new People[n];
        ArrayList<People> arrayList = new ArrayList<>();
        int tmpY, tmpM, tmpD;
        String tmpName = "";
        String[] birthday = null;
        for (int i = 0; i < n; i++) {
//            People tmpPeople=new People();
            tmpName = in.next();
            birthday = in.next().split("/");
            tmpY = Integer.valueOf(birthday[0]);
            tmpM = Integer.valueOf(birthday[1]);
            tmpD = Integer.valueOf(birthday[2]);
//            arrayList.add(new People(tmpName, tmpY, tmpM, tmpD));
            if (!((tmpY < 1814) || (tmpY == 1814 && tmpM < 9) || (tmpY == 1814 && tmpM == 9 && tmpD < 6) || (tmpY > 2014) || (tmpY == 2014 && tmpM > 9) || (tmpY == 2014 && tmpM == 9 && tmpD > 6))) {
                arrayList.add(new People(tmpName, tmpY, tmpM, tmpD));
            }
        }

        Collections.sort(arrayList);
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i).name);
//        }
        System.out.println(arrayList.size() + " " + arrayList.get(0).name + " " + arrayList.get(arrayList.size() - 1).name);
    }
}

class People implements Comparable<People> {
    String name;
    int yyyy;
    int mm;
    int dd;

    People(String name, int yyyy, int mm, int dd) {
        this.name = name;
        this.yyyy = yyyy;
        this.mm = mm;
        this.dd = dd;
    }


    @Override
    public int compareTo(People p1) {
        if (p1.yyyy - this.yyyy != 0)
            return p1.yyyy > this.yyyy ? -1 : 1;
        else if (p1.mm - this.mm != 0) {
            return p1.mm > this.mm ? -1 : 1;
        } else
            return p1.dd > this.dd ? -1 : 1;
    }
}