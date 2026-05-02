package main;

import bank.BankAccount;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber(12345);
        bankAccount.setAccountHolder("Alex");
        bankAccount.setBalance(50.0);

        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getAccountHolder());
        System.out.println(bankAccount.getBalance());
    }
}
