package com.xyz.demo;

import java.util.Scanner;

public class Test1 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double num1 = scanner.nextDouble();
        System.out.println("请输入第二个数字：");
        double num2 = scanner.nextDouble();

        System.out.println("输入操作符：");
        String op = scanner.next();
        switch (op) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("输入错误！");
        }
        scanner.close();
    }
}
