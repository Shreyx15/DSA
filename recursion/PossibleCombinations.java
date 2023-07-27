package com.company.recursion;

public class PossibleCombinations {
    public static void main(String[] args) {
        findCombinations("", 4);
    }

    private static void findCombinations(String sel, int diff) {
        if(diff == 0) {
            System.out.println(sel);
            return;
        }


        for (int i = 1; i <= 6 && i <= diff; i++) {
            findCombinations(sel + i, diff - i);
        }

    }
}
