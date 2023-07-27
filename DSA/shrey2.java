package com.company;

public class shrey2 {
    public static void main(String[] args){
        int[] a = {1,2,3,2,1,5};
        int[] b = {4,5,6};
        merge(a,3,b,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = (m+1)+(n+1);

        int[] result = new int[size];


        System.arraycopy(nums1,0,result,0,m);

        for(int i=0;i<result.length;i++) {
            System.out.println(result[i]);
        }

    }
}
