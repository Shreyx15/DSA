package com.company;

import java.util.ArrayList;
import java.util.List;

public class subsetRepeat {
    public static void main(String[] args) {
        int[] nums = {4,4,4,1,4};
        subsetsOfArray(nums);
        List<List<Integer>> list = subsetsOfArray(nums);
        System.out.println(list);

    }


    static List<List<Integer>> subsetsOfArray(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num: nums) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                if(!outer.contains(inner)) {
                    outer.add(inner);
                } else {
                    continue;
                }
            }
        }
        return outer;}

}

