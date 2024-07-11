package org.kukumama.devopsdaystaipei2024.wallet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public void deposit(long id, double amount) {
        walletRepository.findById(id).ifPresent(wallet -> {
            double newBalance = wallet.getBalance() + amount;
            walletRepository.updateBalance(id, newBalance);
        });
    }
}