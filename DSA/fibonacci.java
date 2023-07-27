package com.company;

public class fibonacci {

    int MAX =100;
    int NIL = -1;
    int[] lookup = new int[MAX];
    void initialize() {
        for (int i = 0; i < MAX; i++) {
            lookup[i] = -1;
        }
    }

    int fib(int n) {
        if(lookup[n]==-1) {
            if(n<=1) lookup[n] = n;
            else lookup[n] = fib(n-1) + fib(n-2);
        }
        return lookup[n];
    }

    public static void main(String[] args) {
        int n = 40;
        fibonacci f= new fibonacci();
        f.initialize();
        System.out.println(f.fib(n));
    }

}
