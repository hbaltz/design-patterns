package singleton;


import singleton.boiler.SynchronizedChocolateBoiler;

import java.util.concurrent.TimeUnit;

// Java code for thread creation by extending
// the Thread class
class MultithreadingSynchronizedDemo extends Thread {
    public void run()
    {
        try {
            // we want to simulate a long creation, simulate case we have to instance in basic case
            TimeUnit.SECONDS.sleep(2);

            SynchronizedChocolateBoiler chocolateBoiler = SynchronizedChocolateBoiler.getInstance();
            chocolateBoiler.fill();
            chocolateBoiler.boil();
            chocolateBoiler.drain();

            System.out.println(
                    "SynchronizedChocolateBoiler reference: " + chocolateBoiler.hashCode() +
                            "(Thread id: " + Thread.currentThread().threadId() + ")"
            );
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

public class MultiThreadSynchronizedChocolateCompany {
    public static void main(String[] args) {
        MultithreadingSynchronizedDemo multithreadingSynchronizedDemo1 = new MultithreadingSynchronizedDemo();
        MultithreadingSynchronizedDemo multithreadingSynchronizedDemo2 = new MultithreadingSynchronizedDemo();
        multithreadingSynchronizedDemo1.start();
        multithreadingSynchronizedDemo2.start();
    }
}
