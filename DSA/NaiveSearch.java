package com.company.DSA;

public class NaiveSearch {
    public static void main(String[] args) {
        String txt = "AABAACAADAABAAABAA";
        String pat = "AABA";

        // Function call
        search(pat, txt);
    }

    private static void search(String pat, String txt) {
        int i = 0;
        while(i < txt.length() - pat.length()) {
            int j = 0;
            int k = i;
            for (j = 0; j < pat.length(); j++) {
                if (txt.charAt(k++) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == pat.length()) {
                System.out.println(i);
            }
            i++;
        }


    }
}
