package com.xyz.lambda;

public class Test {

    static void main() {
//        int test = 1;
        Swim sw = (a,b) -> {
            System.out.println("swim");
            System.out.println("a = " + a);
        };
        sw.swim(1,2);
        sw.test();
    }
}


@FunctionalInterface
interface Swim{
    public abstract void swim(int a,int b);
    default void test(){
        System.out.println("test");
    }

}