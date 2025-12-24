package com.itschool.session38.virtual;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorOp {

    // compute a multiplication and a division in the same time, simulating it takes 2 seconds each to perform the operation
    // then sum their result and see how much it took for the whole program to run
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // start the main thread
        System.out.println("Starting parallel operations on main thread " + Thread.currentThread() +
                " at " + LocalDateTime.now());

        // wrap execution in an ExecutorService (recommended instead of creating classic threads) that can handle complex stuff with multiple threads
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) { // create a virtual thread for each task the ExecutorService submits (2 tasks in our case - 2 threads)
            // submit the task and "promise" to return its result in the future, when the result will be ready (after 2 seconds), without blocking the main thread here (asynchronous computation)
            Future<Integer> futureMult = executorService.submit(() -> { // submit the task (a Callable - functional interface)
                int result = 10 * 2;
                Thread.sleep(2000L);
                System.out.println("Multiplication done. Result: " + result + " on thread " + Thread.currentThread());
                return result;
            });

            Future<Integer> futureDiv = executorService.submit(() -> {
                int result = 20 / 5;
                Thread.sleep(2000L);
                System.out.println("Division done. Result: " + result + " on thread " + Thread.currentThread());
                return result;
            });

            // block here the main thread in order to wait and retrieve the results from the above tasks mapped to 2 threads
            int multiResult = futureMult.get(); // returns the result after 2 seconds (see above Future)
            int divisionResult = futureDiv.get(); // returns the result after 2 seconds (see above Future)

            int finalResult = multiResult + divisionResult;
            // ending the main thread - since both multiplication and divisions are computed by separate threads in the same time,
            // their result is computed in parallel, thus the wait time is not 4 seconds, but 2 seconds (both complete in 2 seconds each)
            System.out.println("The final result is " + finalResult + " on thread " +
                    Thread.currentThread() + " end at " + LocalDateTime.now());
        }
    }
}
