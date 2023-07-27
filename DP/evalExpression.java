package com.company.DP;

public class evalExpression {
    public static void main(String[] args) {
        isScramble("", "coder", "oderc");
    }

    private static void isScramble(String p, String up, String s2) {
        if(up.isEmpty()) {
            if(p.equals(s2)) {
                System.out.println(p);
                return;
            }

            return;
        }

        if(p.length() == s2.length()) {
            return;
        }

        for (int k = 0; k < up.length(); k++) {
            String ls = p + up.substring(0, k + 1);
            String rs = up.substring(k + 1);

            if(ls.isEmpty() || rs.isEmpty()) {
                break;
            }
            isScramble(ls, rs, s2);
            isScramble(rs, ls, s2);
        }


    }
}
