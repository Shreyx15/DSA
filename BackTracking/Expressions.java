package com.company.BackTracking;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Expressions {
    public static void main(String[] args) {
        System.out.println(addOps(0, "123", 6, "", 0));
    }

    static ArrayList<String> addOps(int sum, String up, int target, String p, int pos) {
        ArrayList<String> ans = new ArrayList<>();
       if(pos == up.length()) {
           ArrayList<String> list = new ArrayList<>();
           if(sum == target) {
               list.add(p);
               return list;
           }
       }

        for (int i = pos; i < up.length(); i++) {
            char ch = up.charAt(i);
            if(i != pos) {
                break;
            }
            if(pos == 0) {
               ans.addAll(addOps(sum + (ch - '0'), up, target, p + ch, i + 1));
            } else {
               ans.addAll(addOps(sum + (ch - '0'), up, target, p + "+" + ch, i + 1));
               ans.addAll(addOps(sum - (ch - '0'), up, target, p + "-" + ch, i + 1));
               ans.addAll(addOps(sum * (ch - '0'), up, target, p + "*" + ch, i + 1));
               ans.addAll(addOps(sum / (ch - '0'), up, target, p + "/" + ch, i + 1));
                return ans;
            }
        }

    return ans;}
}
