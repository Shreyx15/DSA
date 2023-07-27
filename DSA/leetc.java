package com.company;

public class leetc {

        public static void main(String[] args) {
            int[] a = {1,7,9};

            searchInsert(a,8);
        }

        public static int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;
            int mid = (int) Math.floor(start + (end - start) / 2);

            while (start <= end) {
                if (nums[mid] == target) {
                    return mid;
                }
                else if (target < nums[mid])
                    end = mid - 1;
                else
                    // this line will point to greater element edge case
                    start = mid + 1;
                Math.floor( mid = start + (end - start) / 2);
            }
            System.out.println(start);
            return start;
        }
    }



