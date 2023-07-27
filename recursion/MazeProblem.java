package com.company.recursion;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(countWays(3, 3));
    }

    static int countWays(int i, int j) {
        if(i == 1 || j == 1) {
            return 1;
        }
        int count = 0;
        count = countWays(i - 1, j) + countWays(i, j - 1);

    return count;}

}
