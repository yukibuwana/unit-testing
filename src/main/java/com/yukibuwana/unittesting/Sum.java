package com.yukibuwana.unittesting;

public class Sum implements Expression {
    Expression augment;
    Expression addmend;

    public Sum(Expression augment, Expression addmend) {
        this.augment = augment;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = augment.reduce(bank, to).amount +
                     addmend.reduce(bank, to).amount;

        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addmend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augment.times(multiplier), addmend.times(multiplier));
    }
}
