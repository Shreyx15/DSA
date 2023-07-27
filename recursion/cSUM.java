package com.company.recursion;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;


public class cSUM {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(nums);
        int target = 8;
        sum(nums, new ArrayList<Integer>(), ans, target, 0);
        System.out.println(ans);
    }

    static void sum(int[] nums, ArrayList<Integer> list, List<List<Integer>> ans, int remain, int i) {

        if(remain < 0) {
            return;
        }
        if(remain == 0) {
            if(list.size() != 3) {
                return;
            }
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int j = i; j < nums.length; j++) {
            if(j > i && nums[j] == nums[j - 1]) {
                continue;
            }
            list.add(nums[j]);
            sum(nums, list, ans, remain - nums[j], j + 1);
            list.remove(list.size() - 1);
        }


    }
}
