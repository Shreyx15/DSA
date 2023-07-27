package com.company.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Krepeat {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String s = "aaabb";
        int k = 3;
        int i = 0;
        int j = 0;
        int max = 0;

        while(i < j) {
            if((j - i) / map.size() >= k) {
                max = Math.max(max, j - i);
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if(map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;
                j++;
            } else {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                j++;
            }
        }

        System.out.println(max);



    }
}
