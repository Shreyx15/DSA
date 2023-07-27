package com.company.recursion;

import java.util.Arrays;

public class validPar {
    public static void main(String[] args) {
        char[] expr = "[()]{}{[()()]()}".toCharArray();
        System.out.println(isValid(expr, expr.length));
    }

    static char findClosing(char ch) {
        if(ch == '{') {
            return '}';
        }
        if(ch == '(') {
            return ')';
        }
        if(ch == '[') {
            return ']';
        }
    return Character.MAX_VALUE;}

    static boolean isValid(char[] expr, int n) {
        if(n == 0) {
            return true;
        }
        if(n == 1) {
            return false;
        }
        if(expr[0] == '}' || expr[0] == ')' || expr[0] == ']') {
            return false;
        }

        char ch = findClosing(expr[0]);
        int count = 0;
        int i = 0;
        for (i = 1; i < n; i++) {
            if(expr[i] == expr[0]) {
                count++;
            }
            if(expr[i] == ch) {
                if(count == 0) {
                    break;
                } count--;

            }
        }

        if(i == n) {
            return false;
        }

        if(i == 1) {
            return isValid(Arrays.copyOfRange(expr, i + 1, n), n - 2);
        }

        return isValid(Arrays.copyOfRange(expr, 1, i), i - 1) && isValid(Arrays.copyOfRange(expr, i + 1, n), n - i - 1);

        
    }
}
