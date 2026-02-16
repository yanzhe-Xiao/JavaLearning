package com.xyz.inner;

public class Inner extends Father {
    class A{
        public void test(){
            Inner.super.show();
            System.out.println("test");
        }
    }
}
