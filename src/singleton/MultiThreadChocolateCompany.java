package singleton;

import singleton.boiler.ChocolateBoiler;

import java.util.concurrent.TimeUnit;

// Java code for thread creation by extending
// the Thread class
class MultithreadingBasicDemo extends Thread {
    public void run()
    {
        try {
            // we want to simulate a long creation, simulate case we have to instance in basic case
            TimeUnit.SECONDS.sleep(2);

            ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
            chocolateBoiler.fill();
            chocolateBoiler.boil();
            chocolateBoiler.drain();

            System.out.println(
                    "ChocolateBoiler reference: " + chocolateBoiler.hashCode() +
                            "(Thread id: " + Thread.currentThread().threadId() + ")"
            );
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

public class MultiThreadChocolateCompany {

    public static void main(String[] args) {
        // Thread test
        MultithreadingBasicDemo multithreadingBasicDemo1 = new MultithreadingBasicDemo();
        MultithreadingBasicDemo multithreadingBasicDemo2 = new MultithreadingBasicDemo();
        multithreadingBasicDemo1.start();
        multithreadingBasicDemo2.start();
    }
}
