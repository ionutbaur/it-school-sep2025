package com.itschool.session17.course.interfaces;

public class CreditCardBankingServiceImpl implements BankingService {

    @Override
    public void pay() {
        System.out.println("Paid with credit card.");
    }

    @Override
    public void accountDetails() {
        System.out.println("You are so poor from CreditCardBankingServiceImpl!");
    }
}
