package org.kukumama.devopsdaystaipei2024.wallet.service;


import org.junit.jupiter.api.Test;
import org.kukumama.devopsdaystaipei2024.wallet.entity.TransactionHistory;
import org.kukumama.devopsdaystaipei2024.wallet.entity.Wallet;

public class TransactionHistoryRepositoryImplTest {

    private TransactionHistoryRepository txRepo;

    @Test
    void transactionHistories_Test_001() {
        txRepo = new TransactionHistoryRepositoryImpl();

        Wallet wallet = new Wallet(1L, 100L);
        txRepo.addTransaction(new TransactionHistory(wallet));

    }

    @Test
    void transactionHistories_Test_002() {
        txRepo = new TransactionHistoryRepositoryImpl();
        txRepo.getTransactionHistories().entrySet()
                .forEach(System.out::println);
    }
}
