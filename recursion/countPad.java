package com.company.recursion;

import java.util.ArrayList;

public class countPad {
    public static void main(String[] args) {
        System.out.println(countPhoneLeet("", "23"));
    }

    static int countPhoneLeet(String p, String up) {
        if(up.isEmpty()) {
            return 1;

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
        int count = 0;
        for (int i = start; i < end; i++) {
            char ch = (char)('a' + i);
            count += countPhoneLeet(p + ch, up.substring(1));
        }

    return count;}
}
