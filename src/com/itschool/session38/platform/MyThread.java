package com.itschool.session38.platform;

public class MyThread extends Thread {

    private final String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    // override run method with our own business logic. This is what the thread will do when started.
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + threadName + " started for iteration " + i +
                    " on thread " + Thread.currentThread());

            try {
                Thread.sleep(1000L); // wait/pause the execution for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread " + threadName + " ended for iteration " + i +
                    " on thread " + Thread.currentThread());
        }
    }
}
