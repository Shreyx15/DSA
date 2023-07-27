package com.company.recursion;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static void main(String[] args) {
        int[] arr = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> ans = new ArrayList<>();
        sum(arr, ans, new ArrayList<>(), 8, 0);
        System.out.println(ans);
    }

    static void sum(int[] num, List<List<Integer>> ans, ArrayList<Integer> list, int remain, int i) {
        if(remain == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(remain < 0) {
            return;
        }

        for (int j = i + 1; j < num.length; j++) {
            list.add(num[j]);
            sum(num, ans, list, remain - num[j], j);
            list.remove(list.size() - 1);
        }
    }
}
