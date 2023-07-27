package com.company.recursion;

public class skipString {
    public static void main(String[] args) {
//      we are skipping App only if its not the Apple
        String up = "hahaAppehannah";
        System.out.println(skip(up));
    }

    static String skip(String up) {
        if(up.isEmpty()) {
            return "";
        }
//        String s = "";
        if(up.startsWith("App") && !up.startsWith("Apple")) {
            return skip(up.substring(3));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }
}
