package PAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Node implements Comparable<Node>{
    int a,b,c;
    int sum;
    Node(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        sum = b+c;
    }
    @Override
    public int compareTo(Node o) {
        if(o.sum-this.sum!=0)
            return o.sum-this.sum;
        else if(o.b-this.b!=0)
            return o.b-this.b;
        else
            return this.a-o.a;
    }
}
public class B_1015_b {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	//快了50-100ms
        String s1[] = in.readLine().split("\\s+");
        int n = Integer.valueOf(s1[0]);
        int l = Integer.valueOf(s1[1]);
        int h = Integer.valueOf(s1[2]);
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int l = sc.nextInt();
//		int h = sc.nextInt();
        ArrayList<Node> arr1 = new ArrayList<Node>();
        ArrayList<Node> arr2 = new ArrayList<Node>();
        ArrayList<Node> arr3 = new ArrayList<Node>();
        ArrayList<Node> arr4 = new ArrayList<Node>();
        int ans = 0;
        while(n-- !=0) {
            String s2[] = in.readLine().split("\\s+");
            int a = Integer.valueOf(s2[0]);
            int b = Integer.valueOf(s2[1]);
            int c = Integer.valueOf(s2[2]);
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			int c = sc.nextInt();
            if(b>=l && c>=l) {
                ans++;
                if(b>=h && c>=h) {
                    arr1.add(new Node(a,b,c));
                }else if(b>=h && c<h) {
                    arr2.add(new Node(a,b,c));
                }else if(b<h && c<h && b>=c) {
                    arr3.add(new Node(a,b,c));
                }else {
                    arr4.add(new Node(a,b,c));
                }
            }
        }
        Collections.sort(arr1);
        Collections.sort(arr2);
        Collections.sort(arr3);
        Collections.sort(arr4);
        System.out.println(ans);
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i).a+" "+arr1.get(i).b+" "+arr1.get(i).c);
        }
        for (int i = 0; i < arr2.size(); i++) {
            System.out.println(arr2.get(i).a+" "+arr2.get(i).b+" "+arr2.get(i).c);
        }
        for (int i = 0; i < arr3.size(); i++) {
            System.out.println(arr3.get(i).a+" "+arr3.get(i).b+" "+arr3.get(i).c);
        }
        for (int i = 0; i < arr4.size(); i++) {
            System.out.println(arr4.get(i).a+" "+arr4.get(i).b+" "+arr4.get(i).c);
        }
    }
}

