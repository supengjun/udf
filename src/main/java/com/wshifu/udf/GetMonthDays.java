package com.wshifu.udf;

import com.aliyun.odps.udf.UDF;
import java.util.Calendar;

public class GetMonthDays extends UDF {
    public GetMonthDays() {
    }

    public int evaluate(String month) {
        Calendar cal = Calendar.getInstance();
        int y = Integer.parseInt(month.substring(0,4));
        int m = Integer.parseInt(month.substring(5,7));
        cal.set(Calendar.YEAR,y);
        cal.set(Calendar.MONTH, m - 1);//Java月份才0开始算
        return cal.getActualMaximum(Calendar.DATE);

    }

//    public static void main(String[] args) {
//        com.wshifu.udf.GetMonthDays a = new com.wshifu.udf.GetMonthDays();
//        System.out.println(a.evaluate("2020-05"));
//    }
}


