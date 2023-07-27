package com.company;

public class shellSort {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1};
        sort(arr);
        System.out.print(arr.toString());
    }

    static void sort(int[] arr) {
        int n = arr.length;


        for(int gap = n/2; n>0; gap /=2) {
            for(int i = gap; i<n;i++) {
                int temp = arr[i];
                int j;
                for(j = i; j>=gap && arr[j - gap] > temp; j -=gap) {
                    arr[j] = arr[j - gap];
                    arr[j] = temp;
                }
            }
        }
    }
}
