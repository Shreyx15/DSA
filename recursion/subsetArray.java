package com.company.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        subsetsOfArray(nums);
        List<List<Integer>> list = subsetsOfArray(nums);
        System.out.println(list);

    }


    static List<List<Integer>> subsetsOfArray(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(nums);

        outer.add(new ArrayList<>());
        for (int i = 1 ; i < nums.length; i++) {
            int n = outer.size();
            for (int j = 0; j < n; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
    return outer;}
}
