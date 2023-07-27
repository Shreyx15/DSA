package com.company.recursion;

import java.util.ArrayList;

public class MazePrintPath {
    public static void main(String[] args) {
//      findPath("", 4, 4);
        System.out.println(retPathList("", 3, 3));
    }

    static void findPath(String p, int i, int j) {

        if(i == 1 && j == 1) {
            System.out.println(p );

        } else if(j > 1) {
            findPath(p + 'R', i, j - 1);
        } else if(i > 1){
            findPath(p + 'D', i - 1, j);
        } else {
            findPath(p + 'R', i, j - 1);
            findPath(p + 'D', i - 1, j);
        }



    }
    static ArrayList<String> retPathList(String p, int i, int j) {
        ArrayList<String> ans = new ArrayList<>();
        if(i == 1 && j == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(j > 1) {
            ans.addAll(retPathList(p + 'R', i, j - 1));
        }
        if(i > 1){
            ans.addAll(retPathList(p + 'D', i - 1, j));
        }
        if(i > 1 && j > 1) {
            ans.addAll(retPathList(p + 'd', i - 1, j - 1));
        }





    return ans;}




}
