package Leetcode;

import java.util.Stack;

public class Leetcode_20_validParentheses {

    public boolean isValid1(String S){
        char [] s=S.toCharArray();
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length; i++) {
            if((s[i])=='{'||s[i]=='['||s[i]=='('){
                stack.push(s[i]);
            }else if(s[i]==')'){
                if(!stack.isEmpty()){
                    char pop=stack.pop();
                    if(pop=='(')
                        continue;
                    else return false;
                }else return false;
            }
            else if(s[i]==']'){
                if(!stack.isEmpty()){
                    char pop=stack.pop();
                    if(pop=='[')
                        continue;
                    else return false;
                }else return false;
            }
            else if(s[i]=='}'){
                if(!stack.isEmpty()){
                    char pop=stack.pop();
                    if(pop=='{')
                        continue;
                    else return false;
                }else return false;
            }
        }
        return stack.isEmpty();
    }


    public boolean isValid(String s) {
        char[] a = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == '(' || a[i] == '[' || a[i] == '{') {
                stack.push(a[i]);
            } else if (a[i] == ')') {
                if (!stack.isEmpty()) {
                    char pop = stack.pop();
                    if (pop == '(') {
                        continue;
                    } else return false;
                } else return false;

            } else if (a[i] == ']') {
                if (!stack.isEmpty()) {
                    char pop = stack.pop();
                    if (pop == '[') {
                        continue;
                    } else return false;
                } else return false;

            } else if (a[i] == '}') {
                if (!stack.isEmpty()) {
                    char pop = stack.pop();
                    if (pop == '{') {
                        continue;
                    } else return false;
                } else return false;

            }
        }
        return stack.isEmpty();
    }
}

