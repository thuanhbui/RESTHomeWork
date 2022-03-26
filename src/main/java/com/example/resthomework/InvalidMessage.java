package com.example.resthomework;

public class InvalidMessage implements IResult {

    private final String errMsg;

    public  InvalidMessage(String errMsg) {
        this.errMsg = errMsg;
    }

    @Override
    public String getResult() {
        return errMsg;
    }
}
