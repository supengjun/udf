package com.wshifu.udf;

import com.aliyun.odps.udf.UDF;
import org.apache.commons.lang.ArrayUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class CombineArray extends UDF {
    public CombineArray() {
    }

    public String[] combine(String []first, String []second) {
        String[] temp = (String[]) ArrayUtils.addAll(first, second);
        Set<String> set=new HashSet<String>(Arrays.asList(temp));
        return set.toArray(new String[0]);
    }

//    public static void main(String[] args) {
//        com.wshifu.udf.CombineArray a = new com.wshifu.udf.CombineArray();
//        String [] arry1 = {"A","B","A","D","F"};
//        String [] arry2 = {"F","G","H","D","J"};
//        System.out.println(Arrays.toString(a.combine(arry1, arry2)));
//    }
}
