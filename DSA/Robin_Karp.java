package com.company.DSA;

public class Robin_Karp {

    public static final int d = 256;

    public static void main(String[] args) {
        String txt = "GEEKS FOR GEEKS";
        String pat = "GEEK";
        int q = 101; // A prime number that helps to find the hash according to the book and some logic applied here
        search(pat, txt, q);
    }

    private static void search(String pat, String txt, int q) {
        int patlen = pat.length();
        int textlen = txt.length();
        int patHash = 0;
        int textHash = 0;
        int hash = 1;


        for (int i = 0; i < patlen - 1; i++) {
            hash = (hash * d)%q;
        }

        for (int i = 0; i < patlen; i++) {
            patHash = (d * patHash + pat.charAt(i)) % q;
            textHash = (d * textHash + txt.charAt(i)) % q;
        }

        for (int i = 0; i <= textlen - patlen; i++) {
            if(patHash == textHash) {
                int j = 0;
                for (j = 0; j < patlen; j++) {
                    if(!(txt.charAt(i + j) == pat.charAt(j))) {
                        break;
                    }
                }


                if(j == patlen) {
                    System.out.println(i);
                }
            }

            if(i < textlen - patlen) {
                textHash = (d * (textHash - txt.charAt(i) * hash)  +  txt.charAt(i + patlen)) % q;
                if(textHash < 0) {
                    textHash += q;
                }

//                System.out.println(textHash);
            }


        }

    }
}
