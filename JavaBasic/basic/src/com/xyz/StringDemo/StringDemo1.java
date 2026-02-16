package com.xyz.StringDemo;

import java.util.Scanner;

public class StringDemo1 {
    static void main() {
        // 字符串常量池
        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 = " + (s1 == s2));
        System.out.println("s1.equals(s2) = " + s1.equals(s2));

        String s3 = new String("abc");
        System.out.println("s1 == s3 = " + (s1 == s3));
        System.out.println("s1.equals(s3) = " + s1.equals(s3));


        // 简易版的登录
//        String loginName = "admin";
//        System.out.println("请输入登录名：");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//        // 字符串的比较应该使用equals方法，而不是==，因为==比较的是对象的地址，而equals比较的是对象的内容
//        // 只有当字符串常量池中的字符串和输入的字符串内容相同时，才会返回true，否则返回false
////        String s = String.valueOf(1.0);
////        System.out.println("s = " + s);
//        if (loginName.equals(input)) {
//            System.out.println("登录成功");
//        } else {
//            System.out.println("登录失败");
//        }

        System.out.println("===============================");
        // substring方法
        // 12345678901 ---> 123****8901
        String phone = "12345678901";
        String newPhone = phone.substring(0, 3) + "****" + phone.substring(7);
        System.out.println("newPhone = " + newPhone);

//        double v = Double.parseDouble("1.0");
//        System.out.println("v = " + v);


    }


}
