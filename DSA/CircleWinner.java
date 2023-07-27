package com.company;

import java.util.LinkedList;

public class CircleWinner {
    public static void main(String[] args) {
        System.out.println(FindTheWinner(6, 5));
    }
    static int FindTheWinner(int n, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k - 1; j++) {
                list.add(list.poll());
            }
            ans = list.poll();
        }
    return ans;}
}
