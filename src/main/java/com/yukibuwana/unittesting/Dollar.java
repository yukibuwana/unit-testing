package com.yukibuwana.unittesting;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    protected Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

    //TODO: use parent class
    @Override
    protected String currency() {
        return currency;
    }
}
