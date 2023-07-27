package com.company.DSA;

public class LPS_Array {
    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB";
        String pat = "AAACAAAAAC";
        int patlen = pat.length();
        int[] arr = new int[patlen];
        createLPS(pat, arr, patlen);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void createLPS(String pat, int[] arr, int N) {
        int i = 0;
        int j = 1;
        arr[i] = 0;
        while(j < N) {
            if(pat.charAt(i) == pat.charAt(j)) {
                i++;
                arr[j] = i;
                j++;
            } else {
                if(i == 0) {

                    arr[j] = i;
                    j++;
                } else if(i != 0){
                    i = arr[i - 1];
                }

            }
        }

    }

}
