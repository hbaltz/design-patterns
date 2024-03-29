package state.gumball_machine.gumball_machine_state;

import state.gumball_machine.GumballMachine;

import java.util.Random;

public class HasQuarterState implements IGumballMachineState{
    /**
     * Used to have a winner in 10% of the time
     */
    private final Random randomWinner = new Random(System.currentTimeMillis());
    private final GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another coin");
    }

    @Override
    public void ejectQuarter() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
        System.out.println("Quarter returned");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("Your turned...");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
        return true;
    }

    @Override
    public void dispense() {
        System.out.println("You need to turn the crank to buy a gumball");
    }

    @Override
    public void fill() {
        System.out.println("The machine has ben filled");
    }
}
