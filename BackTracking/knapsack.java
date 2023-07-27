package com.company.BackTracking;

import java.util.Comparator;

public class knapsack implements Comparator<knapsack> {
    public int value, weight;

    public static int fp = Integer.MIN_VALUE;
    public static int fw = 0;
    public knapsack(int val, int wt)
    {
        this.weight = wt;
        this.value = val;
    }


    @Override
    public int compare(knapsack item1, knapsack item2) {
        double cpr1 = (double)item1.value/item1.weight;
        double cpr2 = (double)item2.value /(double)item2.weight;

        if(cpr1 < cpr2) {
            return 1;
        } else return -1;
    }


    public int getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }


    public static void main(String[] args) {
        knapsack[] items = {
                new knapsack(11, 1),
                new knapsack(21, 11),
                new knapsack(31, 21),
                new knapsack(33, 23),
                new knapsack(43, 33),
                new knapsack(54, 43),
                new knapsack(55, 45),
                new knapsack(65, 55),
        };

        boolean[] ans = new boolean[items.length];

        computeMax(items, 0, 0, 0, items.length, ans, 110);
        System.out.println(fp);
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(ans[i]);
//        }

    }



    private static void computeMax(knapsack[] items, int i, int cp, int cw, int N, boolean[] ans, int capacity) {
        if((cp > fp && i == N) &&  cw <= capacity) {
            fp = cp;
            for (int j = 0; j < N; j++) {
                System.out.println(ans[j]);
            }
            return;
        }

        if(cw > capacity || i >= N) {
            return;
        }



            ans[i] = true;
           computeMax(items, i + 1, cp + items[i].value, cw + items[i].weight, N, ans, capacity);
            ans[i] = false;

            computeMax(items, i + 1, cp, cw, N, ans, capacity);



  }


}
