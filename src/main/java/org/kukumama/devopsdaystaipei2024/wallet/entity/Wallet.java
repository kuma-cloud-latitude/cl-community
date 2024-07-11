package org.kukumama.devopsdaystaipei2024.wallet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Wallet {

    private long id;

    private long balance; // Conflict

    //test comment

    public void transfer(Wallet to, long amount) {
        long remaining = this.balance - amount;;
        to.setBalance(to.balance + amount);
        this.balance = remaining;
    }
}
