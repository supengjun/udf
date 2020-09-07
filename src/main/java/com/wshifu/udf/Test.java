package com.wshifu.udf;

import com.wshifu.udf.CombineArray;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        com.wshifu.udf.CombineArray a = new com.wshifu.udf.CombineArray();
        String[] arry1 = {"A", "B", "A", "D", "F"};
        String[] arry2 = {"F", "G", "H", "D", "J"};
        System.out.println(Arrays.toString(a.combine(arry1, arry2)));
    }
}