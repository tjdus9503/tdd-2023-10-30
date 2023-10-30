package com.ll;

public class Calc {
    public static int run(String expression) {
        String[] sArr = expression.split("\\*");
        sArr[0] = sArr[0].trim();
        sArr[1] = sArr[1].trim();

        int left = Integer.parseInt(sArr[0]);
        int right = Integer.parseInt(sArr[1]);

        return left * right;
    }
}