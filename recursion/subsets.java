package com.company.recursion;

import java.util.ArrayList;


public class subsets {
    public static void main(String[] args) {

        findSubsts("", "abc");

    }

    private static ArrayList<String> findSubsts(String s, String word) {
        if (word.isEmpty()) {
            ArrayList<String> res = new ArrayList<>();
            res.add(s);
            System.out.println(res);
            return res;
        }
        char ch = word.charAt(0);
        ArrayList<String> left = findSubsts(s + ch, word.substring(1));
        ArrayList<String> right = findSubsts(s, word.substring(1));

        left.addAll(right);
        return left;
    }
}