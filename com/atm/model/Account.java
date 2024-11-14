package com.atm.model;

import java.util.Scanner;
public class Account {
    private String accountNumber;
    private String pin;
    private double balance;
    private static final double MINIMUM_BALANCE = 50000; // Saldo minimal

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Getter dan Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public void changePin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan PIN baru: ");
        String newPin1 = scanner.nextLine();
        
        if (newPin1.equals(pin)) {
            System.out.println("PIN sudah pernah dipakai, masukkan PIN yang berbeda.");
            return;
        }
        System.out.print("Masukkan PIN lagi: ");
    String newPin2 = scanner.nextLine();
    
    if (newPin1.equals(newPin2)) {
        pin = newPin1;
        System.out.println("PIN telah diperbarui.");
    } else {
        System.out.println("PIN tidak sama, periksa kembali.");
    }
}

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        this.balance -= amount;
    }
    public double getMinimumBalance() {
        return MINIMUM_BALANCE;
    }
}
