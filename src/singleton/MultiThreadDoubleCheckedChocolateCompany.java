package singleton;

import singleton.boiler.DoubleCheckedChocolateBoiler;

import java.util.concurrent.TimeUnit;

// Java code for thread creation by extending
// the Thread class
class MultithreadingDoubleCheckedDemo extends Thread {
    public void run()
    {
        try {
            // we want to simulate a long creation, simulate case we have to instance in basic case
            TimeUnit.SECONDS.sleep(2);

            DoubleCheckedChocolateBoiler chocolateBoiler = DoubleCheckedChocolateBoiler.getInstance();
            chocolateBoiler.fill();
            chocolateBoiler.boil();
            chocolateBoiler.drain();

            System.out.println(
                    "DoubleCheckedChocolateBoiler reference: " + chocolateBoiler.hashCode() +
                            "(Thread id: " + Thread.currentThread().threadId() + ")"
            );
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

public class MultiThreadDoubleCheckedChocolateCompany {
    public static void main(String[] args) {
        MultithreadingDoubleCheckedDemo multithreadingDoubleCheckedDemo1 = new MultithreadingDoubleCheckedDemo();
        MultithreadingDoubleCheckedDemo multithreadingDoubleCheckedDemo2 = new MultithreadingDoubleCheckedDemo();
        multithreadingDoubleCheckedDemo1.start();
        multithreadingDoubleCheckedDemo2.start();
    }
}
