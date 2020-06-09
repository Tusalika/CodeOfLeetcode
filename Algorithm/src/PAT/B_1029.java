package PAT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_1029 {
    public static void main(String[] args) {
        int a []=new int[200];
        for (int i = 0; i < a.length; i++) {
            a[i]=0;
        }

        Scanner in=new Scanner(System.in);
        char [] s1=in.next().toUpperCase().toCharArray();
        char [] s2=in.next().toUpperCase().toCharArray();

        List<Character> characters=new ArrayList<>();

        for (int i = 0; i < s1.length; i++) {
            if(!characters.contains(s1[i])){
                characters.add(s1[i]);
            }
        }

        for (int i = 0; i < s2.length; i++) {
            if (characters.contains(s2[i])){
                characters.remove(characters.indexOf(s2[i]));
            }
        }

        for (int i = 0; i < characters.size(); i++) {
            System.out.print(characters.get(i));
        }


    }
}
