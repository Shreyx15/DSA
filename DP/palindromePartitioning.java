package com.company.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class palindromePartitioning {
    static int[][] dp;
    public static void main(String[] args) {
        dp = new int[7][7];
        for(int[] arr: dp) {
            Arrays.fill(arr, -1);
        }
        List<String> list = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        count("aaabba", 0, 5, list, ans);
        System.out.println(ans);
    }
    static void count(String s, int i, int j, List<String> temp, List<List<String>> ans) {
        if(i == j) {
            ans.add(temp);
            return;
        }



        for(int k = i;  k < j; k++) {
            if(isPalindrome(s, i, k)) {
                temp.add(s.substring(i, k + 1));
            } else {
                continue;
            }
            count(s, k + 1, j, temp, ans);
            temp.remove(temp.size() - 1);
        }



    }

    static boolean isPalindrome(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
