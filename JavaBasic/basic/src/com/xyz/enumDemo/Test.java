package com.xyz.enumDemo;

public class Test {
    static {
        System.out.println("Test static block");
    }


    static void main(String[] args) {
        A a1 = A.X;
        A a2 = A.你好;
        System.out.println("a1 = " + a1);
        System.out.println(a1.ordinal());
        System.out.println("a2 = " + a2);
        System.out.println(a2.ordinal());
//        new Test();
    }
}
