package com.example.resthomework;

public class CalculateResult implements IResult {

    private final float result;

    public CalculateResult(float result) {
        this.result = result;
    }

    public String getResult() {
        return Float.toString(result);
    }
}
