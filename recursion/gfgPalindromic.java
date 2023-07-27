package com.company.recursion;


import java.util.ArrayList;
import java.util.HashSet;

public class gfgPalindromic {
    public static void main(String[] args) {
        System.out.println(pal("geeksxnitin"));
    }
    static HashSet<String> pal(String s) {
        HashSet<String> ans = new HashSet<>();

        if(s.length() < 2) {
            return new HashSet<>();
        }
        if(isPal(s)) {
            HashSet<String> list = new HashSet<>();
            list.add(s);
            return list;
        } else {
            ans.addAll(pal(s.substring(1)));
            ans.addAll(pal(s.substring(0, s.length() - 1)));
        }

    return ans;}
    static boolean isPal(String s) {
        int start = 0;
        int end = s.length() - 1;
        if(s.length() < 2) {
            return false;
        }
        while(start < end) {
            if(s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
    return true;}


}
