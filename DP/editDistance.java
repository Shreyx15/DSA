package com.company.DP;

import java.util.Scanner;

public class editDistance {
    public static void main(String[] args) {
//        String a = "intention";
//        String b = "execution";
//        System.out.println(dis(a, b, a.length(), b.length()));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n >= 0) {
            for(int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
            n--;
            System.out.println();
        }
    }

//    private static int dis(String w1, String w2, int i, int j) {
//        if(i == 0 || j == 0) {
//            if(i != 0) {
//                return i;
//            } else {
//                return 0;
//            }
//        }
//
//        int ans = 0;
//        if(w1.charAt(i - 1) == w2.charAt(j - 1)) {
//            ans = dis(w1, w2, i - 1, j - 1);
//        } else {
//            ans = 1 + dis(w1, w2, i - 1, j);
//            ans = Math.min(ans, 1 + dis(w1, w2, i, j - 1));
//            ans = Math.min(ans, 1 + dis(w1, w2, i - 1, j - 1));
//        }
//
//        return ans;
//    }
}
