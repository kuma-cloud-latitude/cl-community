package org.kukumama.devopsdaystaipei2024.wallet.service;

import org.kukumama.devopsdaystaipei2024.wallet.entity.Wallet;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WalletRepository {

    Optional<Wallet> findById(long id);
    void updateBalance(long id, double balance);
}
