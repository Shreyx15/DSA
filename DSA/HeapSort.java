package com.company.DSA;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {1,5,0,4,5};
        sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int N = arr.length;
        int n = (int) Math.ceil(N/2);
        for(int i = n; i>=0;i--) {
            heapify(arr, N, i);
        }

        for(int j = N-1; j>0; j--) {
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            heapify(arr, j, 0);
        }


    }

    static void heapify(int[] arr, int N, int root) {
        int max = root;

        int l = 2*root +1;
        int r = 2*root +2;

        if(l<N && arr[l] > arr[max]) {
            max = l;
        }
        if(r<N && arr[r] > arr[max]) {
            max = r;
        }

        if(max != root) {
            int temp = arr[root];
            arr[root] = arr[max];
            arr[max] = temp;
        }

    }
}
