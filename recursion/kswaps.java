package com.company.recursion;

import java.util.Arrays;

public class kswaps {
    private static String max = "";
    public static void main(String[] args) {
        kswaps("7599".toCharArray(), 4);
        System.out.println(max);
    }

    static void kswaps(char[] arr, int k) {

        if(k == 0) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    if(String.valueOf(arr).compareTo(String.valueOf(max)) > 0) {
                        max = String.valueOf(arr);
                    }

                    kswaps(arr, k - 1);

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }

    }
}
