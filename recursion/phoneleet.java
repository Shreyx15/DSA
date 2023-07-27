package com.company.recursion;

public class phoneleet {
    public static void main(String[] args) {
        pad("", "12");
    }

    private static void pad(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        int start = (digit - 1) * 3;
        int end = digit * 3;

        for (int i = start; i < end; i++) {
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }
}
