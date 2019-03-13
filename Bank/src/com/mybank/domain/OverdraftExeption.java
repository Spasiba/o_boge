package com.mybank.domain;

public class OverdraftExeption extends Exception {
    private final double deficit;

    public OverdraftExeption(String msg, double deficit) {
        super(msg);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}