package com.company.recursion;

import java.util.ArrayList;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] obs = {
                {true, true, true},     //Create rowDes x colDes boolean matrix
                {true, false, true},
                {true, true, true}
        };


        System.out.println(retObs("", 0, 0, 2, 2, obs));
        System.out.println(retCount(0, 0, 2, 2, obs));
    }

    private static int retCount(int i, int j, int rowDes, int colDes, boolean[][] obs) {
        int count = 0;
        if(!obs[i][j]) {
            return 0;
        }
        if(i == rowDes || j == colDes) {
            return 1;
        }

        count = retCount(i + 1, j, rowDes, colDes, obs) + retCount(i, j + 1, rowDes, colDes, obs);
        return count;
    }

    static ArrayList<String> retObs(String p, int i, int j, int rowDes, int colDes, boolean[][] obs) {
        ArrayList<String> ans = new ArrayList<>();
        if(!obs[i][j]) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        if(i == rowDes && j == colDes){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        if(i < 2) {
            ans.addAll(retObs(p + 'R', i + 1, j, rowDes, colDes, obs));
        }
        if(j < 2) {
            ans.addAll(retObs(p + 'D', i, j + 1, rowDes, colDes, obs));
        }

        return ans;}
}
