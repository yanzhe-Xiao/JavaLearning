package com.xyz.array;

public class ArrayDemo1 {

    static void main(String[] args) {
        randomName();
    }

    // 开发一个随机点名的系统，假设有15名学生
    public static void randomName() {
        String[] names = {"你好", "我", "他", "她", "它", "他们", "我们", "你", "anda", "anda", "anda", "anda", "anda", "anda", "anda"};
        System.out.println("names = " + names);
        int index = (int)(Math.random() * names.length);
        System.out.println(names[index]);
    }
}

