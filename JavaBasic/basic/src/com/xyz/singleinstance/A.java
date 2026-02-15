package com.xyz.singleinstance;

public class A {
    private int num;
    // 设计单例类
    // 1. 私有化构造器，禁止外部创建对象
    private A(){

    }

    // 2. 提供一个静态的成员变量，保存单例对象
    private static final A instance = new A();

    // 3. 提供一个公共的静态方法，返回单例对象
    public static A getInstance() {
        return instance;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
