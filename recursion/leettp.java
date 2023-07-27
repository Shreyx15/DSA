package com.company.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leettp {
    public static void main(String[] args) {
        System.out.println(freekick(new int[]{1, 2, 3, 4}, 0, new ArrayList<>()));
    }

    private static List<Integer> freekick(int[] nums, int i, List<Integer> list) {
        if(i == 1) {
            return list;
        }

        for (int j = i + 1; j < nums.length; j++) {
            int k = j + 1;
            int m = j;

            if(k >= nums.length) {
                break;
            }
            list.add(nums[i]);
            while(m <= k) {
                list.add(nums[m]);
            }


        }

        return freekick(nums, i + 1, list);

    }

}
