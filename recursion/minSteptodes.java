package com.company.recursion;

public class minSteptodes {
    private static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
       minSteps(0, 384, 1);
        System.out.println(min);
    }

    static int minSteps(int pos, int target, int count) {
        if(pos == target) {
            if(target % 2 == 0) {
                return count - 1;
            } else {
                return count;
            }
        } else if(pos > target) {
            int temp = minSteps(pos - (count + 1), target, count);
            if(temp < min) {
                min = temp;
            }
            return temp;
        }

        int other = minSteps(pos + count, target, count + 1);
        if(other < min) {
            min = other;
        }

    return other;}
}
