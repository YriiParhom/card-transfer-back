package ru.netology.cardtransferback.controllers;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.cardtransferback.model.CardAccount;
import ru.netology.cardtransferback.model.Card;
import ru.netology.cardtransferback.model.CardTransfer;
import ru.netology.cardtransferback.service.TransferService;

@RestController

public class TransferController {

    private TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public void cardTransfer(@Validated @RequestBody CardTransfer cardTransfer) {
        Card card = new Card(cardTransfer.getCardNumber(), cardTransfer.getCardValidTill(),
                cardTransfer.getCardCvv());

    }
}
