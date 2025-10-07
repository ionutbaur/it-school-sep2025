package com.itschool.session17.course.interfaces;

public class Pos {

    private final BankingService bankingService;

    public Pos(BankingService bankingService) {
        this.bankingService = bankingService;
    }

    public void transaction() {
        System.out.println("Begin transaction");
        bankingService.pay();
        System.out.println("Transaction with success!");
        bankingService.accountDetails();
    }
}
