package com.company.recursion;

import java.util.ArrayList;

public class leetcodeDice {
    public static void main(String[] args) {
        System.out.println(findDice("", 4));
    }
    private static ArrayList<String> findDice(String sel, int target) {
        if(target == 0) {
            if(sel.length() == 2) {
                ArrayList<String> list = new ArrayList<>();
                list.add(sel);
                return list;
            } else {
                ArrayList<String> list = new ArrayList<>();
                return list;
            }
        }

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <=6 && i <=target ; i++) {
            ans.addAll(findDice(sel + i, target - i));
        }
        return ans;}
}
