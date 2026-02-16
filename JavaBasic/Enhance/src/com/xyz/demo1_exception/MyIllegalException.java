package com.xyz.demo1_exception;

public class MyIllegalException extends RuntimeException{
    public MyIllegalException() {
        super("输入的参数不合法");
    }

    public MyIllegalException(String message) {
        super(message);
    }
}
