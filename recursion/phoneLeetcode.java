package com.company.recursion;

import java.util.ArrayList;

import static com.company.recursion.countPad.countPhoneLeet;

public class phoneLeetcode {
    public static void main(String[] args) {
//        System.out.println('1' - '3');
        System.out.println(findCombinations("", "77"));
        System.out.println(countPhoneLeet("", "77"));
    }


    private static ArrayList<String> findCombinations(String p, String up) {
        if(up.isEmpty()) {
//            System.out.println();
            if(p.isEmpty()) {
                return new ArrayList<>();
            } else {

                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
        }


        int digit = up.charAt(0) - '1';
        int start = (digit - 1) * 3;
        int end = digit * 3;

        switch (digit) {
            case 6:
                end += 1;
                break;
            case 7:
                start += 1;
                end += 1;
                break;
            case 9:
                start += 1;
                end += 2;
                break;

        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = start; i < end; i++) {
            char ch = (char)('a' + i);
            ans.addAll(findCombinations(p + ch, up.substring(1)));
        }



    return ans;}
}
