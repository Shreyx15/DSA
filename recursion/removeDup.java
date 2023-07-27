package com.company.recursion;

public class removeDup {
    public static void main(String[] args) {
        remove("", "geeksforgeeks");
    }
    static void remove(String p, String up) {

        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);


        if (p.isEmpty()) {
            remove(p + c, up.substring(1));
        } else {
            char last = p.charAt(p.length() - 1);
            if (c == last) {
                remove(p, up.substring(1));
            } else {
                remove(p + c, up.substring(1));
            }
        }

    }
}
