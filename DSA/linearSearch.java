package com.company.DSA;


public class linearSearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int indexOfElement = Search(array, 7);
        System.out.println(indexOfElement);

    }

    static int Search(int[] arr, int element) {
        if(arr.length == 0) return -1;

        for(int i = 0;i<arr.length;i++) {
            if(element == arr[i]) {
                return i;
            }

        }
    return  -1;}
}
