package com.company;

public class MoveBalls {

    public static void main(String[] args) {
        String a = "110";
        int[] res = new int[a.length()];
        minOperations(a,res);

        System.out.println(res);
    }





    public static int[] minOperations(String boxes,int[] arr) {


        for(int i=0;i<boxes.length();i++) {
            arr[i] = boxes.charAt(i) - '0';
        }
        int i=0;
        while(i<arr.length) {
            int j=arr.length-1;
            while(j>=0 && i < j) {
                if(arr[j]!=0) {
                    arr[i] = arr[i] + Math.abs(i-j);
                    j--;
                }

                if(i==j) j--;

            }
            i++;
        }


        return arr; }
}