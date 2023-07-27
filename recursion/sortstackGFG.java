package com.company.recursion;

import java.util.Stack;

public class sortstackGFG {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        reverse(s);
        System.out.println(s);

    }

    static void reverse(Stack<Integer> st) {
        if(!st.isEmpty()) {
            int x = st.pop();
            reverse(st);

            sortandinsert(st, x);
        }
    }

    private static void sortandinsert(Stack<Integer> st, int x) {
        if(st.isEmpty() || x > st.peek()) {
            st.push(x);
            return;
        }

        int temp = st.pop();
        sortandinsert(st, x);
        st.push(temp);

    }


}
