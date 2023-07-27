package com.company.recursion;

public class removeUnwanted {
    public static void main(String[] args) {
        String up = "hannhhahaahnnh";
        String match = "hannh";

        remove(up, match, "");
    }

    private static void remove(String up, String match, String s) {


            if(match.isEmpty()) {
                System.out.println(s);
                return;
            }
            char ch1 = up.charAt(0);
            char ch2 = match.charAt(0);

            if(ch1 == ch2) {
                remove(up.substring(1), match.substring(1), s + ch1);
            } else {
                remove(up.substring(1), match, s);
            }
    }

}

