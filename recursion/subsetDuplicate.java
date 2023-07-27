package com.company.recursion;


import java.util.ArrayList;
import java.util.List;

public class subsetDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(subset(nums));
    }

    private static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end  = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i-1] == nums[i]) {
                start = end + 1;
            }
            end = outer.size() - 1;

            int n = outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }

    return outer;}
}
