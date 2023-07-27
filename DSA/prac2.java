package com.company;

public class prac2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,4};
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != 4 ) {
                System.out.println(arr[i]);
            }
            else {
                i++;
            }
        }
    }
}