package org.kukumama.devopsdaystaipei2024.wallet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@AllArgsConstructor
@Data
public class TransactionHistory {

    private long id;
    private long amount;
    private Timestamp createdAt;

    public TransactionHistory(Wallet wallet) {
        this.id = wallet.getId();
        this.amount = wallet.getBalance();
        this.createdAt = new Timestamp(System.currentTimeMillis());
    }

}
