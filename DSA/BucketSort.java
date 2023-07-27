package com.company;
import java.util.*;
public class BucketSort {
    public static void main(String[] args) {
        float[] array = {(float) 0.123, (float) 0.555, (float) 0.666, (float) 0.999};
        sort(array, array.length);
        for(float el : array) {
            System.out.print(el);
        }
    }

    static void sort(float[] arr, int n) {
        if (n <= 0) return;

        @SuppressWarnings("unchecked")
        Vector<Float>[] buckets = new Vector[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();
        }

        for (int i = 0; i < n; i++) {
            float index = arr[i] * n;
            buckets[(int) index].add((float) arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }
}
