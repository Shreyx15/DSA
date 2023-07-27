package com.company.DSA;

import java.util.Comparator;
import java.util.HexFormat;
import java.util.PriorityQueue;

public class HuffmanCode implements Comparator<HuffmanCode> {
    char c;
    int freq;
    HuffmanCode left;
    HuffmanCode right;


    @Override
    public int compare(HuffmanCode o1, HuffmanCode o2) {
        return o1.freq - o2.freq;
    }

    public static void main(String[] args) {
        int n = 6;
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] charfreq = { 5, 9, 12, 13, 16, 45 };

        PriorityQueue<HuffmanCode> pq = new PriorityQueue<HuffmanCode>(n, new Comparator<HuffmanCode>() {
            @Override
            public int compare(HuffmanCode o1, HuffmanCode o2) {
                return 0;
            }
        });

        for (int i = 0; i < n; i++) {
            HuffmanCode newNode = new HuffmanCode();
            newNode.c = charArray[i];
            newNode.freq = charfreq[i];
            newNode.left = null;
            newNode.right = null;
            pq.add(newNode);

        }
        HuffmanCode root = null;
//        System.out.println(pq.poll().c);
//       HuffmanCode root = null;
//        System.out.println(pq.size());
        while (pq.size() > 1) {
            HuffmanCode x = pq.peek();
            pq.poll();
            HuffmanCode y = pq.peek();
            pq.poll();

            HuffmanCode newAdded = new HuffmanCode();
            newAdded.c = '-';
            newAdded.freq = x.freq + y.freq;
            newAdded.left = x;
            newAdded.right = y;
//            System.out.println(newAdded.c);
            root = newAdded;
//            System.out.println(newAdded.c);
//            System.out.println(root.freq);
            pq.add(root);


        }

        printQueue(root, "");
    }

    private static void printQueue(HuffmanCode root, String s) {
        if(root.left == null && root.right == null) {
            if(Character.isLetter(root.c)) {
                System.out.println(root.c + ":" + s);
                return;
            }
        }

        printQueue(root.left, s + '0');
        printQueue(root.right, s + '1');

    }
}
