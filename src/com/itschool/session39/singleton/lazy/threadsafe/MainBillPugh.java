package com.itschool.session39.singleton.lazy.threadsafe;

public class MainBillPugh {

    public static void main(String[] args) throws ClassNotFoundException {
        // load the class in memory without using it - is will NOT create the instance
        Class.forName("com.itschool.session39.singleton.lazy.threadsafe.BillPughSingleton");

        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton3 = BillPughSingleton.getInstance();

        System.out.println(billPughSingleton1);
        System.out.println(billPughSingleton2);
        System.out.println(billPughSingleton3);

        billPughSingleton2.displayMessage();
    }
}
