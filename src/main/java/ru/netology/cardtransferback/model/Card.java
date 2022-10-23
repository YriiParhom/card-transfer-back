package ru.netology.cardtransferback.model;

public class Card {
    private String cardNumber;
    private String cardValidTill;
    private String cardCvv;

    public Card(String cardNumber, String cardValidTill, String cardCvv) {
        this.cardNumber = cardNumber;
        this.cardValidTill = cardValidTill;
        this.cardCvv = cardCvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardValidTill() {
        return cardValidTill;
    }

    public String getCardCvv() {
        return cardCvv;
    }
}
