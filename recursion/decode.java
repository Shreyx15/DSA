package com.company.recursion;

public class decode {
    private static int i = 0;
    public static void main(String[] args) {
        System.out.println(Decode("3[a2[c]]"));
    }

    static String Decode(String s) {
       StringBuilder sb = new StringBuilder();
       String temp = "";
       int count = 0;

       while(i < s.length()) {
           char c = s.charAt(i);
           i++;
           if(c == '[') {
               temp = Decode(s);
               for (int j = 0; j < count; j++) {
                   sb.append(temp);
               }
           } else if(c == ']') {
               break;
           } else if(Character.isLetter(c)) {
               sb.append(c);
           } else {
               count = count * 10 + (c - '0');
           }
       }
    return sb.toString();}


}
