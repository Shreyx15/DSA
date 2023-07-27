package com.company.recursion;

import java.util.Stack;

public class StackGFG {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        Stack<Integer> ans = new Stack<>();
        reverse(st, ans);
    }

    private static void reverse(Stack<Integer> st, Stack<Integer> ans) {

        if(st.isEmpty()) {
            System.out.println(ans);
            return;
        }
        int a = st.peek();
        ans.push(a);
        st.pop();
        reverse(st, ans);


    }
}
