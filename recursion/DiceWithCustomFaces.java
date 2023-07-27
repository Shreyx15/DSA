package com.company.recursion;

import java.util.ArrayList;

public class DiceWithCustomFaces {
    public static void main(String[] args) {

        System.out.println(findComb("", 5, 8));
    }
    private static ArrayList<String> findComb(String sel, int target, int faces) {
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(sel);
            return list;
        }


        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <=faces && i <=target ; i++) {
            ans.addAll(findComb(sel + i, target - i, faces));
        }
        return ans;}
}
