package com.company.recursion;

import java.util.ArrayList;
import java.util.List;

public class LS {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9,18};
        List<Integer> res = new ArrayList<Integer>();
        System.out.println(search(arr, 0, 18));
        System.out.println(findIndex(arr, 0, 18));
        System.out.println(findAllIndex(arr, 0, 18, (ArrayList<Integer>) res));
        System.out.println(res.isEmpty());
    }

    private static List<Integer> findAllIndex(int[] arr, int index, int target, ArrayList<Integer> res) {
        if(index == arr.length) {
            return res;
        } else if(arr[index] == target) {
            res.add(index);
        } else {
            return findAllIndex(arr, index + 1, 18, res);
        }
    return res;}


    private static int findIndex(int[] arr, int index, int target) {
         if(index == arr.length){
            return -1;
        } else if(arr[index] == target) {
             return  index;
         } else {
            return findIndex(arr, index + 1, target);
        }
     }

    private static boolean search(int[] arr, int index, int target) {
        if(index == arr.length) {
            return false;
        }

    return arr[index] == target || search(arr, index + 1, target);
    }


}
