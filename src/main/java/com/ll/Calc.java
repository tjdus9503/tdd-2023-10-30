package com.ll;

public class Calc {
    public static int run(String exp) {
        if (exp.isBlank()) return 0;

        String[] expBits = exp.split(" ");
        String operator = expBits[1];
        int num1 = Integer.parseInt(expBits[0]);
        int num2 = Integer.parseInt(expBits[2]);

        final int rs = switch(operator) {
            case "+":
                yield num1 + num2;
            case "-":
                yield num1 - num2;
            case "*":
                yield num1 * num2;
            default:
                yield num1 / num2;
        };

        return rs;
    }
}