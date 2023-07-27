package com.company.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class permutationsList {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        System.out.println(findListOfPermutations("", "too", ans));
    }

    private static ArrayList<String> findListOfPermutations(String p, String rem, ArrayList<String> ans) {

        if(rem.isEmpty()) {
//            ArrayList<String> ans = new ArrayList<>();

            ans.add(p);
            return ans;
        }
        char ch = rem.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            findListOfPermutations(p.substring(0, i) + ch + p.substring(i), rem.substring(1), ans);

        }



    return ans;}
}
