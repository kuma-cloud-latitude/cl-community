package org.kukumama.devopsdaystaipei2024.wallet.service;

import org.kukumama.devopsdaystaipei2024.wallet.entity.TransactionHistory;

import java.util.HashMap;
import java.util.Map;

public class TransactionHistoryRepositoryImpl implements TransactionHistoryRepository {

    private static Map<Long, TransactionHistory> histories = new HashMap<>();


    @Override
    public Map<Long, TransactionHistory> getTransactionHistories() {
        return histories;
    }

    @Override
    public int addTransaction(TransactionHistory wallet) {
        histories.put(wallet.getId(), wallet);
        return 1;
    }
}
