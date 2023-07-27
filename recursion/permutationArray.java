package com.company.recursion;

import java.util.ArrayList;
import java.util.List;

public class permutationArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        permutations(nums, new ArrayList<Integer>(), ans);
        System.out.println(ans);
    }

    static void permutations(int[] nums, ArrayList<Integer> list, List<List<Integer>> ans) {

        if(list.size() == 3) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int j = 0; j < nums.length; j++) {

            if(list.contains(nums[j])) {
                continue;
            }
            list.add(nums[j]);
            permutations(nums, list, ans);
            list.remove(list.size() - 1);

        }
    }
}
