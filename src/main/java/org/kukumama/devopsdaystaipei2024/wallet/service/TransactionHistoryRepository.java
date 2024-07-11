package org.kukumama.devopsdaystaipei2024.wallet.service;

import org.kukumama.devopsdaystaipei2024.wallet.entity.TransactionHistory;

import java.util.Map;

public interface TransactionHistoryRepository {

    Map<Long, TransactionHistory> getTransactionHistories();
    int addTransaction(TransactionHistory wallet);

}
