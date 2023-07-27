package com.company.DSA;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {55,46,12,56,48};
        Quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void Quicksort (int[] arr, int low, int hi) {
        if(low>=hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s)/2;
        int pivot = arr[m];

        while(s<=e) {
            while(arr[s]<pivot) {
                s++;
            }
            while(arr[e]>pivot) {
                e--;
            }
            if(s<=e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        Quicksort(arr, low, e);
        Quicksort(arr, s, hi);

    }
}
