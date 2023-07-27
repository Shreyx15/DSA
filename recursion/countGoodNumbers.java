package com.company.recursion;



public class countGoodNumbers {
    public static void main(String[] args) {
        int num = 5;

        System.out.println(myPow(3, 2));

    }

    public static int myPow(int x, int n) {
        if(n == 0) {
            return 1;
        }


        int p = myPow(x, n / 2);

        if(n%2 == 0) {
            return p = p * p;
        } else{
            return p = p*p*x;
        }
    }
}
