package com.xyz.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;

public class ArrayDemo2 {
    static void main(String[] args) {
        double[] doubles = inputStudentScore();

    }
    // 设计一个方法定义学生成绩
    public static double[] inputStudentScore() {
        Scanner scanner = new Scanner(System.in);
        double [] scores = new double[8];
        for (int i = 0; i < 8; i++) {
            double score = scanner.nextDouble();
            scores[i] = score;
        }
        for(double score : scores){
            System.out.println(score);
        }
        return scores;
    }
}
