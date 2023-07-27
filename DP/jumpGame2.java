package com.company.DP;

import java.util.Arrays;

public class jumpGame2 {
    private static boolean[] visited;
    public static void main(String[] args) {
        int[] arr = new int[]{3,0,2,1,2};
        visited = new boolean[arr.length];
        System.out.println(canReach(arr, 2, arr.length));
    }


    private static boolean canReach(int[] arr, int i, int len) {
        if(i >= len || i < 0) {
            return false;
        }

        if(visited[i]) {
            return false;
        }
        int maxjumps = arr[i];
        if(maxjumps == 0) {
            return true;
        }

        for(int j = 1; j <= maxjumps; j++) {



            if(canReach(arr, i + j, len)) {
                return true;
            }
            if(canReach(arr, i - j, len)) {
                return true;
            }

        }

        return false;
    }
}
