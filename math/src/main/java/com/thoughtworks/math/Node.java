package com.thoughtworks.math;

public class Node {
    private char operator;
    private double value;
    private Node left;
    private Node right;

    public double evaluate() {
        switch (operator) {
            case '#':
                return value;
            case '+':
                return left.evaluate()
                        + right.evaluate();
            case '*':
                return left.evaluate()
                        + right.evaluate();
            // case ... edit this for each new operator
            default:
                throw new UnsupportedOperationException("Operator " + operator + " not supported");

        }
    }
}
