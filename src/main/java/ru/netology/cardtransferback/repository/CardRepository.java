package ru.netology.cardtransferback.repository;

import org.springframework.stereotype.Repository;
import ru.netology.cardtransferback.model.Card;

import java.util.ArrayList;
import java.util.List;


@Repository
public class CardRepository {

    private List<Card> cardList = new ArrayList<>();

    {
        cardList.add(new Card("1111222233334444", "12/23", "123"));
        cardList.add(new Card("2222333344445555", "01/24", "234"));
        cardList.add(new Card("3333444455556666", "02/24", "345"));
    }

    public boolean isExistCard(Card card) {
        boolean result = false;
        for (Card cards: cardList) {
            if (card.getCardNumber().equals(cards.getCardNumber()) || card.getCardCvv().equals(cards.getCardCvv()) ||
            card.getCardValidTill().equals(cards.getCardValidTill())){
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

}
