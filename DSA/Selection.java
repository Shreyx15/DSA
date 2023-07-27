package com.company;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] array = {4,5,1,2,30};
        selection(array);
        System.out.println(Arrays.toString(array));
    }

    static void selection(int[] arr) {

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int last  = arr.length -1 -i;
            int maxindex = getmaxindex(arr, 0, last);
            swap(arr, maxindex, last);

        }
    }

    static int getmaxindex(int[] array, int start, int end) {
        int max = start;
        for(int i=start;i<=end;i++) {
            if(array[max]<array[i]) {
                max = i;
            }
        }
    return max;}

    static void swap(int[] array, int first, int last) {
        int temp = array[first];
        array[first] = array[last];
        array[last] = temp;
    }
}
