package com.xyz.demo1_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    static void main() throws ParseException {
        // 目标：认识异常体系 搞清楚异常的基本作用
//        test1();
        test2();

    }


    // 定义一个方法认识运行时异常
    public static void test1() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

     // 定义一个方法认识编译时异常 处理日期
    public static void test2() throws ParseException {
        String str = "2024-06-30";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date data = sdf.parse(str);
        System.out.println(data);

    }

}
