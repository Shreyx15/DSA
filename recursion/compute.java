package com.company.recursion;

import java.util.*;


public class compute {
    public static void main(String[] args) {
        Integer[] ints = {1, 2, 2, 3, 3, 4, 4, 5, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(ints));
//        list.removeAll(Arrays.asList(2));
        System.out.println(foobar(list, 1));

    }

    public static List<Integer> foobar(List<Integer> list, int n) {
        int i = 0;
        int count = 1;
        while(i < list.size() - 1 ) {
           int j = i + 1;
            while(j < list.size()) {
                if(list.get(j) == list.get(i)) {

                    count++;
                    j++;
                } else {
                    break;
                }


            }
            if(count > n) {
                int num = list.get(i);
                list.removeIf(k -> Objects.equals(k, num));
            }
            count = 1;
        }


    return list;}
}
