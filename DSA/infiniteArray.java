package com.company;

public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,88,9,10,11,12,13,14};
        System.out.print(ans(arr, 4));
    }
    static int ans(int[] arr, int target) {
        int s = 0;
        int e = 1;

        while(arr[e] < target) {
            int temp = e + 1;
            e = e + (e - s + 1)*2;
            s = temp;
        }
    return Search(arr, target, s, e);
    }

    static int Search(int[] arr, int target, int start, int end) {
        int mid = start + (end- start)/2;
        while(start <= end) {
            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else if(target == arr[mid]) {
                return mid;
            }
        }
        return -1;}

}
