package com.company.recursion;

public class countDice {
    public static void main(String[] args) {
        ;
        System.out.println(CountDiceComb("", 4, 2));
    }

    private static int CountDiceComb(String p, int target, int NumOfDice) {
        if(target == 0) {
            if(p.length() == NumOfDice) {
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;
        for (int i = 1; i <= target; i++) {
            count += CountDiceComb(p + i, target - i, NumOfDice);
        }



    return count;}
}
