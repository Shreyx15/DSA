package com.company.recursion;

public class powerOfString {
    public static void main(String[] args) {
        power("", "abc");
    }

    static void power(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        power(p + ch, up.substring(1));
        power(p, up.substring(1));



    }
}
