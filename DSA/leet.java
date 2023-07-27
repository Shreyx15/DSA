package com.company;


public class leet {
    public static void main(String[] args) {
        int[] a = {1,3,5,6};

        searchInsert(a,2);
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (nums[mid] == target) {
                return mid;
            }
            else if (target < nums[mid])
                end = mid - 1;
            else
                // this line will point to greater element edge case
                start = mid + 1;
            mid = start + (end - start) / 2;
        }
        return mid;
    }
}

