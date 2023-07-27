package com.company.recursion;
import java.util.ArrayList;

public class subSeqAscii {
    public static void main(String[] args) {
        ArrayList<String> res = new ArrayList<>();
        subseq("", "abc", res);
        System.out.println(res);
    }

    private static void subseq(String s, String word, ArrayList<String> res) {
        if(word.isEmpty()) {

            res.add(s);

            return;
        }
        char ch = word.charAt(0);
        subseq(s + ch, word.substring(1), res);
        subseq(s, word.substring(1), res);
        subseq(s + (ch + 0), word.substring(1), res);


    }
}
