package com.itschool.session38.platform;

import java.time.LocalDateTime;

public class MainPlatformThreads {

    public static void main(String[] args) throws InterruptedException {
        // starting the program (on the main thread)
        System.out.println("Started program on main thread " + Thread.currentThread() +
                " at " + LocalDateTime.now());

        // creating new threads
        MyThread threadA = new MyThread("A");
        MyThread threadB = new MyThread("B");
        // creating a Thread with a Runnable (functional interface implemented with lambda) as constructor param
        Thread threadC = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread C started for iteration " + i +
                        " on thread " + Thread.currentThread());

                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread C ended for iteration " + i +
                        " on thread " + Thread.currentThread());
            }
        });

        // start the threads (mandatory, otherwise the above defined threads won't start)
        threadA.start();
        threadB.start();
        threadC.start();

        Thread.sleep(1000L); // pause the main thread for 1 second
        // end the main thread
        System.out.println("Ended program on main thread " + Thread.currentThread() +
                " at " + LocalDateTime.now());
    }
}
