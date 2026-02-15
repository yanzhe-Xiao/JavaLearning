package com.xyz.singleinstance;

public class Test
{
    static void main() {
//        A a = new A();
        A instance = A.getInstance();
        System.out.println("instance = " + instance);
        A instance1 = A.getInstance();
        System.out.println("instance1 = " + instance1);
        instance1.setNum(10);
        System.out.println("instance.getNum() = " + instance.getNum());
        System.out.println("instance1.getNum() = " + instance1.getNum());

        B instance2 = B.getInstance();
        System.out.println("instance2 = " + instance2);
        B instance3 = B.getInstance();
        System.out.println("instance3 = " + instance3);
        instance3.setNum(20);
        System.out.println("instance2.getNum() = " + instance2.getNum());
        System.out.println("instance3.getNum() = " + instance3.getNum());
    }
}
