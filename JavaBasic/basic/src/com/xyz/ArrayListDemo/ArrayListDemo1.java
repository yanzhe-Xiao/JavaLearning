package com.xyz.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    static void main(String[] args) {
        // 目标：掌握ArrayList的基本使用
        // 增添改查
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
//        System.out.println("list = " + list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));


        boolean removed = list.remove("helo");
        System.out.println("removed = " + removed);
        System.out.println("list = " + list);

        // 修改数据
        list.set(0, "hi");
        System.out.println("list = " + list);
    }

}
