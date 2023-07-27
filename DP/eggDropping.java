package com.company.DP;

public class eggDropping {
    private static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        System.out.println(solve(2, 100));
    }

    public static int solve(int eggs, int floors) {
        if (eggs == 1) {
            return floors;
        }
        if (floors == 0 || floors == 1) {
            return floors;
        }

        int min = Integer.MAX_VALUE;
        int low = 1;
        int high = floors;


        while(low <= high) {
            int mid = (low + high) / 2;

            int eggbreak = solve(eggs - 1, mid - 1);
            int notbreak = solve(eggs, floors - mid);

            int worstMoves = 1 + Math.max(eggbreak, notbreak);


            if(low < high) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            min = Math.min(min, worstMoves);
        }

        return min;
    }

}
