package com.company.SlidingWindow;

import java.util.*;
import java.util.*;

public class learn {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> imap = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();

        for(char c: p.toCharArray()) {
            imap.put(c, imap.getOrDefault(c, 1) + 1);
        }

        while(j < s.length()) {
            map.put(s.charAt(j), 1);

            if(j - i + 1 == p.length()) {
                if(map.equals(imap)) {
                    list.add(i);
                }
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 1) - 1);

                if(map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }

                i++;
                j++;
            } else {
                map.put(s.charAt(j), map.getOrDefault(j, 0) + 1);
                j++;
            }
        }

        System.out.println(list);
    }
}
