package com.company.recursion;


import java.util.ArrayList;

public class findCombinationList {
    public static void main(String[] args) {
        System.out.println(findList("", 4));
    }

    private static ArrayList<String> findList(String sel, int target) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(sel);
            return list;
        }


        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <=6 && i <=target ; i++) {
            ans.addAll(findList(sel + i, target - i));
        }
    return ans;}
}
