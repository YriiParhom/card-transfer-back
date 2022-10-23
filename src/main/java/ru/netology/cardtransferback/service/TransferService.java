package ru.netology.cardtransferback.service;

import org.springframework.stereotype.Service;
import ru.netology.cardtransferback.model.Card;
import ru.netology.cardtransferback.model.CardAccount;
import ru.netology.cardtransferback.model.CardTransfer;
import ru.netology.cardtransferback.repository.CardRepository;

@Service
public class TransferService {
    private CardRepository cardRepository;
    private Card card;
    private CardAccount cardAccount;

    public TransferService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

}
