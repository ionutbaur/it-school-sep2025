package com.itschool.session17.course.interfaces;

public interface BankingService {

    void pay();

    // public method with concrete/default impl - instance specific
    default void accountDetails() {
        String financialStatus = getFinancialStatus();
        System.out.println(financialStatus);
    }

    // static - non instance specific
    static void accountName() {
        System.out.println("Ionutz Gabriel Baur");
        // String financialStatus = getFinancialStatus(); does not work because of static context
    }

    // instance specific
    private String getFinancialStatus() {
        accountName();
        return "Your are rich";
    }
}
