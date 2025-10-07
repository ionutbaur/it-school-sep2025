package com.itschool.session17.course.interfaces;

public interface OtherBankingService extends Interf1, Interf2 {

    void pay();

    void receiveMoney();

    default void accountDetails() {
        System.out.println("You are broke!");
    }
}
