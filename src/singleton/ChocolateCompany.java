package singleton;

import singleton.boiler.DoubleCheckedChocolateBoiler;
import singleton.boiler.EagerlyChocolateBoiler;
import singleton.boiler.SynchronizedChocolateBoiler;

public class ChocolateCompany {

    public static void main(String[] args) {
        // Synchronized method
        SynchronizedChocolateBoiler synchronizedChocolateBoiler1 = SynchronizedChocolateBoiler.getInstance();
        synchronizedChocolateBoiler1.fill();

        SynchronizedChocolateBoiler synchronizedChocolateBoiler2 = SynchronizedChocolateBoiler.getInstance();
        synchronizedChocolateBoiler2.fill();

        displaySeparator();

        System.out.println("synchronizedChocolateBoiler1 reference: " + synchronizedChocolateBoiler1.hashCode());
        System.out.println("synchronizedChocolateBoiler2 reference: " + synchronizedChocolateBoiler2.hashCode());

        displaySeparator();

        // Eagerly method
        EagerlyChocolateBoiler eagerlyChocolateBoiler1 = EagerlyChocolateBoiler.getInstance();
        eagerlyChocolateBoiler1.fill();
        eagerlyChocolateBoiler1.boil();

        EagerlyChocolateBoiler eagerlyChocolateBoiler2 = EagerlyChocolateBoiler.getInstance();
        eagerlyChocolateBoiler2.fill();
        eagerlyChocolateBoiler2.boil();

        displaySeparator();

        System.out.println("eagerlyChocolateBoiler1 reference: " + eagerlyChocolateBoiler1.hashCode());
        System.out.println("eagerlyChocolateBoiler2 reference: " + eagerlyChocolateBoiler2.hashCode());

        displaySeparator();

        // Double check method
        DoubleCheckedChocolateBoiler doubleCheckedChocolateBoiler1 = DoubleCheckedChocolateBoiler.getInstance();
        doubleCheckedChocolateBoiler1.fill();
        doubleCheckedChocolateBoiler1.boil();
        doubleCheckedChocolateBoiler1.drain();

        DoubleCheckedChocolateBoiler doubleCheckedChocolateBoiler2 = DoubleCheckedChocolateBoiler.getInstance();
        doubleCheckedChocolateBoiler2.fill();
        doubleCheckedChocolateBoiler2.boil();
        doubleCheckedChocolateBoiler2.drain();

        displaySeparator();

        System.out.println("doubleCheckedChocolateBoiler1 reference: " + doubleCheckedChocolateBoiler1.hashCode());
        System.out.println("doubleCheckedChocolateBoiler2 reference: " + doubleCheckedChocolateBoiler2.hashCode());

        displaySeparator();
    }

    private static void displaySeparator() {
        System.out.println("------------------------");
    }
}
