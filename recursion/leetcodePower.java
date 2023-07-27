package com.company.recursion;

public class leetcodePower {
    public static void main(String[] args) {

        System.out.println(pow(2, -2));
    }
    static double pow(int x, int n) {

        if(n == 0) {
            return 1;
        }
//        if(n < 0) {
//            return 1 / pow(x, -n);
//        }


        double p = pow(x, n / 2);

        if(n%2 == 0) {
            return p = p * p;
        } else if(n%2 == 1){
            return p = p *x *p;
        } else {
            return 1/pow(x, -n);
        }

    }
}
