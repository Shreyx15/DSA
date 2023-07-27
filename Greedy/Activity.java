package com.company.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Activity implements Comparator<Activity>{
    int start;
    int finish;

    public Activity() {
    }

    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    public static void main(String[] args) {
        Activity[] arr = new Activity[7];
        arr[0] = new Activity(1, 3);
        arr[1] = new Activity(0, 2);
        arr[2] = new Activity(3, 6);
        arr[3] = new Activity(2, 5);
        arr[4] = new Activity(5, 8);
        arr[5] = new Activity(3, 10);
        arr[6] = new Activity(7, 9);

//        sortByFinish(arr);
        Arrays.sort(arr, new Activity());
        int i = 0;
        System.out.println("(" + arr[i].start + "," + arr[i].finish + ")");
        for (int j = 1; j < arr.length ; j++) {
            if(arr[j].start >= arr[i].finish) {
                System.out.println("(" + arr[j].start  + "," + arr[j].finish +")");
                i = j;
                j = i + 1;
            }
        }
    }

//    private static void sortByFinish(Activity[] arr) {
//        Arrays.sort(arr, new Comparator<Activity>() {
//            @Override
//            public int compare(Activity o1, Activity o2) {
//                return o1.finish - o2.finish;
//            }
//        });
//    }

    @Override
    public int compare(Activity o1, Activity o2) {
        return o1.finish - o2.finish;
    }
}
