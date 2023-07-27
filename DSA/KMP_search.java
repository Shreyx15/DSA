package com.company.DSA;
import static com.company.DSA.LPS_Array.createLPS;

public class KMP_search {
    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB";
        String pat = "AAACAAAAAC";

        KMPSearch(txt, pat);

    }

    private static void KMPSearch(String txt, String pat) {

        int textlen = txt.length();
        int patlen = pat.length();

        int[] lps = new int[patlen];
        createLPS(pat, lps, patlen);
//        for (int k :
//                lps) {
//            System.out.println(k);
//        }
        int i = 0;
        int j = 0;
        while((textlen - i) >= (patlen - j)) {
            if(txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if(j == patlen) {
                System.out.println("Found pattern at index" + (i - j));
                j = lps[j - 1];
            }


            else if(pat.charAt(i) != txt.charAt(j)) {
                if(j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }

            }
        }

    }
}
