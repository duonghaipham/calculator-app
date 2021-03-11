package com.example.calculator;

public class Calculating {
    private String expression;
    private String result;

    public Calculating(String expression, String result) {
        this.expression = expression;
        this.result = result;
    }

    public Calculating(Calculating calculating) {
        expression = calculating.expression;
        result = calculating.result;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
