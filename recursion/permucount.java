package com.company.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class permucount {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        count("", 4, ans);
        System.out.println(ans);
//        System.out.println(ans.size());
    }


    static void count(String p, int num, ArrayList<String> ans) {

        if(num == 0) {
            ans.add(p);
            return;
        }
        for (int i = 0; i <= p.length(); i++) {
            count(p.substring(0, i)+ num + p.substring(i), num - 1, ans);
        }
    }
}
