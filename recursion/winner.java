package com.company.recursion;

public class winner {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2};
        System.out.println(win(nums, 0, nums.length - 1, 0, 0, true));
    }

    static boolean win(int[] nums, int start, int end, int p1, int p2, boolean p1turn) {

        if(start > end) {
            if(p1 > p2) {
                return true;
            } else return false;
        }



        if(p1turn) {
            return win(nums, start + 1, end, p1 + nums[start], p2, false) || win(nums, start, end - 1, p1 + nums[end], p2, false);
        } else {
            return win(nums, start + 1, end, p1, p2 + nums[start], true) && win(nums, start, end - 1, p1, p2 + nums[end], true);
        }
    }
}
