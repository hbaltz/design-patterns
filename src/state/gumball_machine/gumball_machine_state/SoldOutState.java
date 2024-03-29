package state.gumball_machine.gumball_machine_state;

import state.gumball_machine.GumballMachine;

public class SoldOutState implements IGumballMachineState {
    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject a quarter, you haven't insert a quarter yet");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned but there are no gumball");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("No gumball, we are out of stock!");
    }

    @Override
    public void fill() {
        System.out.println("The machine has ben filled");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
