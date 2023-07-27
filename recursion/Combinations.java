package com.company.recursion;

import java.util.ArrayList;

public class Combinations {
    public static void main(String[] args) {
        System.out.println(combinations("", 1));
    }
    static ArrayList<String> combinations(String p,  int i) {
        ArrayList<String> ans = new ArrayList<>();

        if(i == 4) {
            ArrayList<String> list = new ArrayList<>();
            if(p.length() == 2) {
                list.add(p);
                return list;
            }
            return list;
        } else {
            ArrayList<String> list =  new ArrayList<>();
            if(p.length() == 2) {
                list.add(p);
                return list;
            }
        }


        ans.addAll(combinations(p +""+ i, i + 1));
        ans.addAll(combinations(p, i + 1));


    return ans;}
}
