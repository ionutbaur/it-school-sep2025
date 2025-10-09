package com.itschool.session17.course.interfaces;

public class PosMain {

    public static void main(String[] args) {
        BankingService bankingService = new MobileBankingServiceImpl();
        Pos pos = new Pos(bankingService);
        pos.transaction();
        BankingService.accountName();

        System.out.println("============");

        BankingService bankingService2 = new CreditCardBankingServiceImpl();
        Pos pos2 = new Pos(bankingService2);
        pos2.transaction();

        pos2.payDetails();
        pos2.getBankingService().pay();
    }
}
