package org.kukumama.devopsdaystaipei2024.wallet.service;

import org.kukumama.devopsdaystaipei2024.wallet.entity.TransactionHistory;

import java.util.Map;

public class TransactionHistoryRepositoryImpl implements TransactionHistoryRepository {
    @Override
    public Map<Long, TransactionHistory> getTransactionHistories() {
        return Map.of();
    }

    @Override
    public int addTransaction(TransactionHistory wallet) {
        return 0;
    }
}
