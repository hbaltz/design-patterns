package state.gumball_machine;

import state.gumball_machine.gumball_machine_state.*;

/**
 * Modeled a gumball machine as a state machine
 */
public class GumballMachine {
    private final IGumballMachineState soldOutState;
    private final IGumballMachineState noQuarterState;
    private final IGumballMachineState hasQuarterState;
    private final IGumballMachineState soldState;
    private final  IGumballMachineState winnerState;

    private IGumballMachineState currentState;

    private int count = 0;

    private final String name = "Java-enabled Standing Gumball Model #2024";

    /**
     * @param initialNumberOfGumball the number of gumball in the machine. The initial inventory.
     */
    public GumballMachine(int initialNumberOfGumball) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        currentState = soldOutState;

        fill(initialNumberOfGumball);
    }


    /**
     * Manage what happened when we insert a quarter regarding the state of the machine
     */
    public void insertQuarter() {
      currentState.insertQuarter();
    }

    /**
     * Manage what happened when we eject a quarter regarding the state of the machine
     */
    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    /**
     * Manage what happened when we turn the crank of the machine regarding the state of the machine
     */
    public void turnCrank() {
        currentState.turnCrank();
        currentState.dispense();
    }

    /**
     * @param numberOfGumball number of gumball add in the machine
     */
    public void fill(int numberOfGumball) {
        if (numberOfGumball > 0) {
            // To be sure the number of ball is positive, it has no sense to fill a negative number in your case
            count += numberOfGumball;
            currentState.fill();
        }
    }

    /**
     * Helper method to release a ball and update the count
     */
    public void releaseBall() {
        if (count != 0) {
            System.out.println("A gumball comes rolling out of the slot...");
            count -= 1;
        }
    }

    public void setState(IGumballMachineState state) {
        currentState = state;
    }

    public IGumballMachineState getSoldOutState() {
        return soldOutState;
    }

    public IGumballMachineState getNoQuarterState() {
        return noQuarterState;
    }

    public IGumballMachineState getHasQuarterState() {
        return hasQuarterState;
    }

    public IGumballMachineState getSoldState() {
        return soldState;
    }

    public IGumballMachineState getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return name + " {" +
                "currentState=" + currentState +
                ", count=" + count +
                '}';
    }
}
