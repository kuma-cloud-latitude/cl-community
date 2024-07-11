package org.kukumama.devopsdaystaipei2024.wallet.service;

import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public void deposit(long id, long amount) {
        walletRepository.findById(id).ifPresent(wallet -> {
            long newBalance = wallet.getBalance() + amount;
            walletRepository.updateBalance(id, newBalance);
        });
    }
}