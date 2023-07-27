package com.company.recursion;

public class fact {
    public static void main(String[] args) {
        System.out.println(findFact(5));
    }

    private static int findFact(int num) {
        if(num <= 2) {
            return num;
        } else if(num <=0 ) {
            return 0;
        }


        return num * findFact(num - 1);
    }
}
