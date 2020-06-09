package Leetcode;

import java.util.List;

public class Leetcode_22_GenerateParentheses {

    public static void main(String[] args) {
        Leetcode_22_GenerateParentheses s = new Leetcode_22_GenerateParentheses();
        s.generateParenthesis(3);
    }

    public List<String> generateParenthesis(int n) {
        _generate(0, 0,n, "");
        return null;
    }

    private void _generate(int level, int MAX, String s) {
        //terminator

        if (level >= MAX) {

            // filter the invalid s
            System.out.println(s);
            return;
        }

        //process
        String s1 = s + "(";
        String s2 = s + ")";


        //drill down

        _generate(level + 1, MAX, s + "(");
        _generate(level + 1, MAX, s + ")");

        //reverse states
    }

    public void _generate(int left, int right, int n, String s) {
        if (left == n && right == n) {
            System.out.println(s);
            return;
        }

        if (left < n) {
            _generate(left + 1, right, n, s + "(");
        }

        if(left>right){
            _generate(left, right + 1, n, s + ")");
        }
    }

}
