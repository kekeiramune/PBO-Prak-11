package com.atm.transaction;

import com.Account;
import java.util.Scanner;

public class Withdrawal extends Transaction {

    public Withdrawal(Account account) {
        super(account);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah penarikan: ");
        double amount = scanner.nextDouble();

        // Memeriksa apakah saldo setelah penarikan tidak kurang dari saldo minimal
        if (amount <= account.getBalance() - account.getMinimumBalance()) {
            account.debit(amount);
            System.out.println("Penarikan berhasil. Saldo Anda sekarang: " + account.getBalance());
        } else {
            System.out.println("Saldo tidak mencukupi. Anda harus menyisakan minimal " + account.getMinimumBalance());
        }
    }
}