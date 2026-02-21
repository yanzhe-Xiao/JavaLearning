package com.xyz.demo2_genericity;

import java.util.ArrayList;

public class GenericiDemo1 {
    static void main() {
        // 通配符

        ArrayList<Xiaomi> xiaomiList = new ArrayList<>();
        ArrayList<BYD> bydList = new ArrayList<>();
        xiaomiList.add(new Xiaomi());
        xiaomiList.add(new Xiaomi());
        xiaomiList.add(new Xiaomi());

        bydList.add(new BYD());
        bydList.add(new BYD());
        bydList.add(new BYD());
        bydList.add(new BYD());

        go(xiaomiList);
        go(bydList);
    }

    // 通配符：? 代表任意类型
    // 这是泛型的使用
    public static void go(ArrayList<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static <T> void go1(ArrayList<T> list) {
        for (T obj : list) {
            System.out.println(obj);
        }
    }

    // 定义一个泛型方法
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }


}
