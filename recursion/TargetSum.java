package com.company.recursion;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};

        System.out.println(count(nums, 0, 0, 3));
    }

    private static int count(int[] nums, int i, int sum, int target) {
        if(i == nums.length) {
            if(sum == target) {
                return 1;
            } else {
                return 0;
            }
        }
        int count = 0;
        count += count(nums, i + 1, sum + nums[i], target) + count(nums, i + 1, sum - nums[i], target);



    return count;}
}


