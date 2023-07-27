package com.company.Greedy;

import java.util.Comparator;

public class Knapsack implements Comparator<Knapsack> {
    public int value;
    public int weight;

    public Knapsack(int val, int wt)
    {
        this.weight = wt;
        this.value = val;
    }


    @Override
    public int compare(Knapsack item1, Knapsack item2) {
        double cpr1 = (double)item1.value/item1.weight;
        double cpr2 = (double)item2.value /(double)item2.weight;

        if(cpr1 < cpr2) {
            return 1;
        } else return -1;
    }

    private static double getMaxValue(Knapsack[] arr, int capacity) {
        Double totalValue = 0d;
        for (Knapsack i: arr){
            int curWt = (int)i.weight;
            int curVal = (int)i.value;

            if(capacity - curWt >= 0) {
                capacity = capacity - curWt;
                totalValue += curVal;
            } else {
                double fraction
                        = ((double)capacity / (double)curWt);
                totalValue += (curVal * fraction);
                capacity
                        = (int)(capacity - (curWt * fraction));
                break;
            }
        }

    return totalValue;}


    public static void main(String[] args) {
        Knapsack[] arr = { new Knapsack(60, 10),
                new Knapsack(100, 20),
                new Knapsack(120, 30) };

        int capacity = 50;

        double maxValue = getMaxValue(arr, capacity);

        // Function call
        System.out.println("Maximum value we can obtain = "
                + maxValue);
    }


}
