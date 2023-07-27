package com.company;

import java.beans.PropertyEditorSupport;

public class sellPrice {


    public static void main(String[] args) {
        int[] price = {4, 1, 2, 6, 7, 5};

        maxProfit(price);


    }


    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1)
            return 0;

        int min = prices[0]; // min so far
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            result = Math.max(result, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        System.out.println(result);
        return result;
    }

}