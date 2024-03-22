package singleton;

import singleton.boiler.EagerlyChocolateBoiler;

import java.util.concurrent.TimeUnit;

// Java code for thread creation by extending
// the Thread class
class MultithreadingEagerlyDemo extends Thread {
    public void run()
    {
        try {
            // we want to simulate a long creation, simulate case we have to instance in basic case
            TimeUnit.SECONDS.sleep(2);

            EagerlyChocolateBoiler chocolateBoiler = EagerlyChocolateBoiler.getInstance();
            chocolateBoiler.fill();
            chocolateBoiler.boil();
            chocolateBoiler.drain();

            System.out.println(
                    "EagerlyChocolateBoiler reference: " + chocolateBoiler.hashCode() +
                            "(Thread id: " + Thread.currentThread().threadId() + ")"
            );
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

public class MultiThreadEagerlyChocolateDemo {
    public static void main(String[] args) {
        MultithreadingEagerlyDemo multithreadingEagerlyDemo1 = new MultithreadingEagerlyDemo();
        MultithreadingEagerlyDemo multithreadingEagerlyDemo2 = new MultithreadingEagerlyDemo();
        multithreadingEagerlyDemo1.start();
        multithreadingEagerlyDemo2.start();
    }
}
