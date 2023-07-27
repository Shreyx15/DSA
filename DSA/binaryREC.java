package com.company;

public class binaryREC {
    public static void main(String[] args) {
        int[] arr = {1,2,34,5};

        int res = binarySearch(arr, 34, 0, arr.length - 1);
        System.out.println(res);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {


        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target == arr[mid]) {
                return mid;
            }
            if(target > arr[mid]) {
                return binarySearch(arr, target, mid + 1, end);
            }
            if(target < arr[mid]) {
               return binarySearch(arr, target, 0, mid - 1);
            }

        }

        return  -1;


    }
}
