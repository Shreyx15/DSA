package com.company.recursion;

public class IntegerToEnglish {
    private static final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static String ans = "";
    public static void main(String[] args) {
        System.out.println(convert(1234567));
    }

    static String convert(int num) {

        if(num < 20) {
            return LESS_THAN_20[num];
        } else if(num < 100) {
            ans = TENS[num / 10] + " " +  convert(num%10);
        } else if(num < 1000) {
            ans = convert(num / 100) + " Hundred " + convert(num % 100);
        } else if(num < 1000000) {
            ans = convert(num / 1000) + " Thousand " + convert(num % 1000);
        } else if(num < 1000000000) {
            ans = convert(num / 1000000) + " Million " + convert(num % 1000000);
        }
    return ans;}
}
