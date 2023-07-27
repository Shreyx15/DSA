package com.company.recursion;

import java.util.Stack;

public class evaluateExpressio {
    public static void main(String[] args) {
//        System.out.println(true || false);
        System.out.println(evaluate("&(|(t,f))", new Stack<>(), true));
    }

    static boolean evaluate(String up, Stack<Character> st, boolean ans) {
        char ch = up.charAt(0);
        if(ch == ')') {
            st.pop();
            while(!st.isEmpty()) {
                char c = st.pop();
                if(c == '!') {
                    ans = !ans;
                }
            }
            return ans;
        }
        if(ch == 't' || ch == 'f') {
            boolean torf;
            if(ch == 't') {
                torf = true;
            } else {
                torf = false;
            }
            char op = st.peek();
            if(op == '&') {
                ans = ans && torf;
            } else if(op == '|') {
                ans = ans || torf;
            }
            return evaluate(up.substring(1), st, ans);

        }
        if(ch == '|' || ch == '&' || ch == '!') {
            st.push(ch);
            return evaluate(up.substring(1), st, ans);
        }
        if(ch == '(' || ch == ','){
            return evaluate(up.substring(1), st, ans);
        }
    return ans;}
}
