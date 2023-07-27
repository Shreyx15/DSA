package com.company;

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

public class FourSum {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

        data.add(new ArrayList<String>());
        data.get(0).add("String");
        data.get(0).add("sTRING1");

        data.add(new ArrayList<>());
        data.get(1).add("hello");
        System.out.println(data.get(1));
    }

}