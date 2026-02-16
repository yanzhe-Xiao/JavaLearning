package com.xyz.inner;

public class Test {
    static void main() {
        Inner inner = new Inner();
        Inner.A a = inner.new A();
        a.test();
    }
}
