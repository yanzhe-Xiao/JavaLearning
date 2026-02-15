package com.xyz.demo;

// 找素数
public class Test4 {
    static boolean isPrime(int n){
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i = 100; i < 201; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
