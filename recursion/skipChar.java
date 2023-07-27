package com.company.recursion;

public class skipChar {
    public static void main(String[] args) {
        String up = "hannah";
        String match = "hannh";
//        String p = "";
        System.out.println(skip(up));
    }

    static String skip(String up) {
        if(up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }
}
