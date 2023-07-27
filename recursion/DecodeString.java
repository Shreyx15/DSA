package com.company.recursion;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decode("3[a]2[bc]"));
    }

    static StringBuilder decode(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if(c != ']') {
                if(c == '[') {
                    continue;
                }else {
                    st.push(c);
                }
            }
            else {
                String temp = "";
                while(Character.isLetter(st.peek())) {
                    temp += st.pop();

                }
                int n = st.pop() - '0';

                for (int i = 0; i < n ; i++) {
                    sb.append(temp);
                }


            }
        }

    return sb;}
}
