package com.company.recursion;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(isprime(15, 2));
    }

    private static boolean isprime(int num, int div) {
        if(num <= 2) {
            return (num == 2)?true:false;
        }
        if(num % div == 0) {
            return false;
        }
        if(div * div > num) {
            return true;
        }


    return isprime(num, div + 1);}
}
