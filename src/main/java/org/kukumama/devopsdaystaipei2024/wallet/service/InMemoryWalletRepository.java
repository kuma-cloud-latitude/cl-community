package org.kukumama.devopsdaystaipei2024.wallet.service;

import org.kukumama.devopsdaystaipei2024.wallet.entity.Wallet;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryWalletRepository implements WalletRepository {

    private static final Map<Long, Wallet> wallets = new HashMap<>();

    static {
        // Initialize with some fake data
        wallets.put(1L, new Wallet(1L, 100L));
        wallets.put(2L, new Wallet(2L, 150L));
        // Add more fake wallets as needed
    }

    @Override
    public Optional<Wallet> findById(long id) {
        return Optional.ofNullable(wallets.get(id));
    }

    public void updateBalance(long id, long newBalance) {
        Wallet wallet = wallets.get(id);
        if (wallet != null) {
            wallet.setRemaining(newBalance);
        }
    }
}