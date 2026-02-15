package com.xyz.demo;

import java.util.Map;
import java.util.Random;

// 开发验证码
public class Test3 {

    static void main() {
        System.out.println(getVerifyCode(4));
        System.out.println(getVerifyCode(6));
    }

    public static String getVerifyCode(int n) {
        String code = "";
        for (int i = 0; i < n; i++) {
//            Random random = new Random();
            int type = (int)(Math.random() * 3);
            switch (type){
                case 0:
                    code += (char)(Math.random() * 26 + 'a');
                    break;
                case 1:
                    code += (char)(Math.random() * 26 + 'A');
                    break;
                case 2:
                    code += (int)(Math.random() * 10);
                    break;
                default:
                    break;
            }
        }
        return code;
    }
}
