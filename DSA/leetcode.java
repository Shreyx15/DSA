package com.company;
import java.util.*;

public class leetcode {
    public static void main(String[] args){
        int[] a = {1,2,2,2,1,5};
        int[] b = {4,5,6};
        merge(a,3,b,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m+n;

        int[] result = new int[size];


        System.arraycopy(nums1,0,result,0,m);
        System.arraycopy(nums2,0,result,n,n);
        java.util.Arrays.sort(result);

       for(int i=0;i<result.length;i++) {
           System.out.print(Arrays.toString(result));
       }


    }
}
