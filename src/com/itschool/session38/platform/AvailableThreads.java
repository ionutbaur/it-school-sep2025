package com.itschool.session38.platform;

public class AvailableThreads {

    public static void main(String[] args) {
        // max platform threads number the CPU can handle = number of logical processors
        int maxThreadsNo = Runtime.getRuntime().availableProcessors();
        System.out.println(maxThreadsNo);
    }
}
