package com.yukibuwana.unittesting;

public class Franc extends Money {
    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    protected Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    @Override
    protected String currency() {
        return currency;
    }
}
