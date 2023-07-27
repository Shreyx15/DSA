package com.company.recursion;

public class sum {
    public static void main(String[] args) {
        System.out.println(solve(12345));
    }

    private static int solve(int num) {
        if(num == 0) {
            return 0;
        }
        return num%10 + solve(num / 10);
    }
}
