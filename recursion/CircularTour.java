package com.company.recursion;


import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {
    public static void main(String[] args) {
        System.out.println(tour(new int[]{1, 1, 7, 4}, new int[]{6, 5, 5, 5}, 0, new LinkedList<Integer>()));
    }

    private static Queue<Integer> tour(int[] p, int[] d, int i, Queue<Integer> q) {
        if(i >= p.length - 1) {
            return q;
        }

        int cp = p[i];

        int j = i + 1;
        if(cp >= d[i]) {

            while(j != i) {
                j = j % p.length;

                if(j == i) {
                    q.add(i);
                    break;
                }
                if(j == 0) {
                    cp = cp - d[p.length - 1];
                } else {

                    cp = cp - d[j - 1];
                }
                cp += p[j];
                if(cp >= d[j]) {
                    j++;
                }
            }
            if(j == i) {
                q.add(i);
            }


        } else {
             q.addAll(tour(p, d, i + 1, q));
        }
    return q;}


}
