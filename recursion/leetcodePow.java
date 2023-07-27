package com.company.recursion;

public class leetcodePow {
    public static void main(String[] args) {
        int[] arr = {1,0};
        String s= "";
        for (int i = 0; i < arr.length; i++) {
            s = s+arr[i];
        }
        Integer.parseInt(s);


        System.out.println(findmod(2, Integer.parseInt(s))%11);

    }
    static double findmod(int x, double n) {

        if(n == 0) {
            return 1;
        }
//        if(n < 0) {
//            return 1 / pow(x, -n);
//        }


        double p = findmod(x, n / 2);

        if(n%2 == 0) {
            return p = p * p;
        } else {
            return p = p *x *p;
        }

    }
}
