package com.yukibuwana.unittesting;

import java.util.HashMap;

public class Bank {

    private final HashMap<Pair, Integer> rateMap = new HashMap<>();

    public Money reduce(Expression source, String currency) {
        return source.reduce(this, currency);
    }

    public int rate(String from, String to) {
        if (from.equals(to)) return 1;

        return rateMap.get(new Pair(from, to));
    }

    public void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from, to), rate);
    }
}
