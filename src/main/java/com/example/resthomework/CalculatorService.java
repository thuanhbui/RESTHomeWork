package com.example.resthomework;

public class CalculatorService {
    public float calculate(float number1, float number2, String operator) {
        if(operator.equals("+")) {
            return number1 + number2;
        }
        else if(operator.equals("-")) {
            return number1 - number2;
        }
        else if(operator.equals("*")) {
            return number1 * number2;
        }
        else if(operator.equals("/")) {
            if(number2 == 0) {
                throw new IllegalArgumentException("Không thể chia cho 0");
            } else {
                return number1 / number2;
            }
        }
        else if (operator.equals("^")) {
            return (float) Math.pow(number1, number2);
        }
        else {
            throw new IllegalArgumentException("Phép toán không hợp lệ");
        }
    }
}
