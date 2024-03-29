package state.gumball_machine.gumball_machine_state;

import state.gumball_machine.GumballMachine;

public class SoldState implements IGumballMachineState{
    private final GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you have already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        int count = gumballMachine.getCount();

        if (count == 0) {
            System.out.println("Oops, we are now out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }

    @Override
    public void fill() {
        System.out.println("The machine has ben filled");
    }
}
