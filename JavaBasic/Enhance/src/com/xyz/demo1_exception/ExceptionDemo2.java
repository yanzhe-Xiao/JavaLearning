package com.xyz.demo1_exception;

public class ExceptionDemo2 {
    static void main() {
        test1(151);
    }

    // 使用自定义异常
    public static void test1(int age) {
        if (age < 0 || age > 150) {
            throw new MyIllegalException("年龄必须在0-150之间");
        }
        System.out.println("年龄合法: " + age);
    }
}
