package com.company.recursion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class googleLeet {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple","pen","applepen","pine","pineapple"));


        System.out.println(findComb("", "pineapplepenapple", words));
    }

    private static List<String> findComb(String p, String up, ArrayList<String> words) {
        List<String> ans = new ArrayList<>();
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p.trim());
            return list;
        }


        for (String word : words) {
            if(up.contains(word)) {
                int index = up.indexOf(word);
                if(index == 0) {
                    ans.addAll(findComb(p +" "+ word , up.substring(word.length()), words));
                }
            }
        }




    return ans;}
}
