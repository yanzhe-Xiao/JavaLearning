package com.xyz.scanner;

import java.util.Scanner;

public class ScannerDemo {

    static void main() {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的名字：");
        String name = sc.next();
        System.out.println("name = " + name);
        System.out.print("请输入你的年龄：");
        int age = sc.nextInt();
        System.out.println("age = " + age);
    }
}
