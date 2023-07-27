package com.company.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GrayCode {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list = graycode("000", list);
        Collections.sort(list);
        System.out.println(list);
//        String s = "";
//        for (int i = 0; i < 3; i++) {
//            s += "0";
//        }
//        System.out.println(s);
    }

    static ArrayList<String> graycode(String up, ArrayList<String> list) {
        if(list.contains(up)) {
            return list;
        } else {
            list.add(up);
        }

        for (int i = 0; i < up.length(); i++) {
            if(up.charAt(i) == '0') {
                graycode(up.substring(0, i) + "1" + up.substring(i + 1), list);
            }
        }
    return list;}

}
