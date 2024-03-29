package state;

import state.gumball_machine.GumballMachine;

/**
 * Modeled a mall with a gumball machine
 */
public class Mall {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        printObjectWithLineBreak(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        printObjectWithLineBreak(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        printObjectWithLineBreak(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        printObjectWithLineBreak(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        printObjectWithLineBreak(gumballMachine);
    }

    private static void printObjectWithLineBreak(Object object) {
        System.out.println("\n" + object + "\n") ;
    }
}
