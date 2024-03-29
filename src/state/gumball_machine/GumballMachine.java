package state.gumball_machine;

/**
 * Modeled a gumball machine as a state machine
 */
public class GumballMachine {
    private GumballMachineState currentState = GumballMachineState.SOLD_OUT;
    private int count = 0;

    private final String name = "Java-enabled Standing Gumball Model #2024";

    /**
     * @param initialNumberOfGumball the number of gumball in the machine. The initial inventory.
     */
    public GumballMachine(int initialNumberOfGumball) {
        fill(initialNumberOfGumball);
    }

    /**
     * Manage what happened when we insert a quarter regarding the state of the machine
     */
    public void insertQuarter() {
        switch (currentState) {
            case SOLD_OUT -> System.out.println("You can't insert a quarter, the machine is sold out");
            case NO_QUARTER -> {
                currentState = GumballMachineState.HAS_QUARTER;
                System.out.println("You inserted a quarter!");
            }
            case HAS_QUARTER -> System.out.println("You can't insert another coin");
            case SOLD -> System.out.println("Please wait, we're already gibing you a gumball");
        }
    }

    /**
     * Manage what happened when we eject a quarter regarding the state of the machine
     */
    public void ejectQuarter() {
        switch (currentState) {
            case SOLD_OUT -> System.out.println("You can't eject a quarter, you haven't insert a quarter yet");
            case NO_QUARTER -> System.out.println("You haven't inserted a quarter!");
            case HAS_QUARTER -> {
                currentState = GumballMachineState.NO_QUARTER;
                System.out.println("Quarter returned");
            }
            case SOLD -> System.out.println("Sorry, you have already turned the crank");
        }
    }

    /**
     * Manage what happened when we turn the crank of the machine regarding the state of the machine
     */
    public void turnCrank() {
        switch (currentState) {
            case SOLD_OUT -> System.out.println("You turned but there are no gumball");
            case NO_QUARTER -> System.out.println("You turned but there is no quarter");
            case HAS_QUARTER -> {
                System.out.println("Your turned");
                currentState = GumballMachineState.SOLD;
                dispense();
            }
            case SOLD -> System.out.println("Turning twice doesn't get you another gumball");
        }
    }

    /**
     * @param numberOfGumball number of gumball add in the machine
     */
    public void fill(int numberOfGumball) {
        // To be sure the number of ball is positive, it has no sense to have a negative number
        count = Math.max(numberOfGumball, 0);
        // We only change the state if the machine was sod out else the state stay the same
        if (count > 0 && currentState == GumballMachineState.SOLD_OUT) {
            currentState = GumballMachineState.NO_QUARTER;
        }
    }

    @Override
    public String toString() {
        return name + " {" +
                "currentState=" + currentState +
                ", count=" + count +
                '}';
    }

    /**
     * Dispense a gumball if we are in the right state (the gumball has benn sold)
     */
    private void dispense() {
        switch (currentState) {
            case SOLD_OUT -> System.out.println("No gumball, we are out of stock!");
            case NO_QUARTER -> System.out.println("You need to pay first");
            case HAS_QUARTER -> System.out.println("You need to turn the crank to buy a gumball");
            case SOLD -> {
                System.out.println("A gumball comes rolling out of the slot");
                count -= 1;
                if (count == 0) {
                    System.out.println("Oops, we are now out of gumballs!");
                    currentState = GumballMachineState.SOLD_OUT;
                } else {
                    currentState = GumballMachineState.NO_QUARTER;
                }
            }
        }
    }
}
