package com.company.DP;

public class regExpMatching {
    public static void main(String[] args) {
        System.out.println(isMatch("aabaa", "aab", 5, 3));
    }

    private static boolean isMatch(String s, String p, int i, int j) {
        if(i == 0 && j == 0) {
            return true;
        }

        if(j == 0) {
            return false;
        }

        if(i == 0) {
            return true;
        }

        if(s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
            return isMatch(s, p, i - 1, j - 1);
        } else if(p.charAt(j - 1) == '*') {
            return isMatch(s, p, i - 1, j) || isMatch(s, p, i - 1,j - 1);
        } else {
            return isMatch(s, p, i - 1, j);
        }
    }
}
