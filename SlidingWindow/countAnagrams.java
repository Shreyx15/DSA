package com.company.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countAnagrams {
    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pat = "for";
        Map<Character, Integer> patMap = new HashMap<>();
        Map<Character, Integer> txtMap = new HashMap<>();
        int i = 0;
        int j = 0;
        int k = pat.length();
        for (char c: pat.toCharArray()) {
            patMap.put(c, patMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(patMap);
        int count = 0;
        while(j < txt.length()) {

            if(j - i + 1 == k) {
                txtMap.put(txt.charAt(j), txtMap.getOrDefault(txt.charAt(j), 0)+1);
                if(patMap.equals(txtMap)) {
                    count++;
                }
                txtMap.put(txt.charAt(i), txtMap.getOrDefault(txt.charAt(i), 0) - 1);
                if(txtMap.get(txt.charAt(i)) == 0) {
                    txtMap.remove(txt.charAt(i));
                }
                i++;
            } else {
                txtMap.put(txt.charAt(j), txtMap.getOrDefault(txt.charAt(j), 0) + 1);
            }
            j++;
        }

        System.out.println(count);
    }
}
