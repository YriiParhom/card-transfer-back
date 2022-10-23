package ru.netology.cardtransferback.model;


public class CardAccount {
    private int value;
    private String currency;


    public CardAccount() {
        this.value = 100_000;
        this.currency = "RUB";
    }

    public int getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }
}
