package state.gumball_machine.gumball_machine_state;

import state.gumball_machine.GumballMachine;

public class WinnerState implements  IGumballMachineState{
    private final GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball and you won a free one!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you have already turned the crank, but wait you have win an extra free gumball");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball, but you already win an extra gumball");
        return false;
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();

        if (gumballMachine.getCount() == 0) {
            System.out.println("Oops, we are now out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            System.out.println("WINNER !!!!!! You win an extra gumball!");
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() == 0) {
                System.out.println("Oops, we are now out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            } else {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
        }
    }

    @Override
    public void fill() {
        System.out.println("The machine has ben filled");
    }
}
