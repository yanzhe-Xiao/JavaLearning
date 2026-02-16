package com.xyz.StringDemo;

public class StringDemo2 {
    static void main() {
        // 目标：生成验证码
        System.out.println(getCode(1000000000));
    }

    // 帮我生成指定位数的随机验证码返回方法，每位验证码可以是数字或者字母 有大小写字母 用String变量记住全部的字符再随机选择
    public static String getCode(int n) {
        String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int index = (int) (Math.random() * chars.length());
            code.append(chars.charAt(index));
        }
        return code.toString();
    }
}
