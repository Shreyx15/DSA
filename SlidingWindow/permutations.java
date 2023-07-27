package com.company.SlidingWindow;

public class permutations {
    public static void main(String[] args) {
        find("", "abc".toCharArray(), 0);
    }

    private static void find(String p, char[] up, int idx) {
        if(idx == up.length) {
            System.out.println(p);
            return;
        }

        char ch = up[idx];

        for (int i = 0; i <= p.length(); i++) {
            find(p.substring(0, i) + ch + p.substring(i), up, idx++);
        }
    }
}
