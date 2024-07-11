package org.kukumama.devopsdaystaipei2024.wallet.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.kukumama.devopsdaystaipei2024.wallet.entity.Wallet;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class WalletServiceTest {

    @Mock
    private WalletRepository walletRepository;

    @InjectMocks
    private WalletService walletService;

    @Captor
    private ArgumentCaptor<Wallet> walletCaptor;

    @Test
    void deposit_successfully() {
        // Arrange
        long walletId = 1L;
        long initialBalance = 100L;
        long depositAmount = 50L;
        Wallet testWallet = new Wallet(walletId, initialBalance);
        when(walletRepository.findById(walletId)).thenReturn(Optional.of(testWallet));

        // Act
        walletService.deposit(walletId, depositAmount);

        // Assert
        verify(walletRepository).findById(walletId);
        
//        verify(walletRepository).updateBalance(eq(walletId), walletCaptor.capture());
//        Wallet updatedWallet = walletCaptor.getValue();

//        assertEquals(initialBalance + depositAmount, updatedWallet.getBalance());
    }

    @Test
    void test_transfer(){

        Wallet fromWallet = new Wallet(1, 100);
        Wallet toWallet = new Wallet(2, 200);

        fromWallet.transfer(toWallet, 100);

        Assertions.assertEquals(fromWallet.getBalance(), 0);
        Assertions.assertEquals(toWallet.getBalance(), 300);
    }
}