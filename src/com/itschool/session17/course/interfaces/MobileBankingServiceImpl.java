package com.itschool.session17.course.interfaces;

public class MobileBankingServiceImpl implements BankingService, OtherBankingService {

    @Override
    public void pay() {
        System.out.println("Paid with mobile phone.");
    }

    @Override
    public void receiveMoney() {

    }

    @Override
    public void accountDetails() {
        OtherBankingService.super.accountDetails();
    }

    @Override
    public void debit() {

    }

    @Override
    public void credit() {

    }
}
