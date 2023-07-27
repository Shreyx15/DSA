package com.company.recursion;

public class mul {
    public static void main(String[] args) {
        System.out.println(solve(100, 5));
    }

    private static int solve(int x, int y) {
        if(x < y) {
            return solve(y, x);
        } else if(y != 0) {
            return x + solve(x, y - 1);
        }


    return 0;}
}
