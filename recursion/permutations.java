package com.company.recursion;


import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;

public class permutations {
    public static void main(String[] args) {

//        findPermutations("", "too");
//        System.out.println("Total number of permutations are " + permutationCount("", "too"));
        String s = "cdba";
        String f = "abcd";

//        System.out.println(Array.sort(s.toCharArray()).equals(f));
        Arrays.sort(s.toCharArray());

//
    }

    private static int permutationCount(String p, String rem) {


        if(rem.isEmpty()) {
            return 1;
        }
        int count  = 0;
        char ch = rem.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            count += permutationCount(p.substring(0, i) + ch + p.substring(i), rem.substring(1));
        }



    return count;}


    static void findPermutations(String p, String rem) {

        if(rem.isEmpty()) {
            System.out.println(p);
            return ;
        }
        char ch = rem.charAt(0);
//        int n = p.length();
        for (int i = 0; i <= p.length(); i++) {
            findPermutations(p.substring(0,i) + ch + p.substring(i), rem.substring(1));
        }


    }

}

