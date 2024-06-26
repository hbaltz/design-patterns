package state.gumball_machine.gumball_machine_state;

import state.gumball_machine.GumballMachine;

public class NoQuarterState implements IGumballMachineState{
    private final GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.println("You inserted a quarter!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter!");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned but there is no quarter");
        return false;
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void fill() {
        System.out.println("The machine has ben filled");
    }
}
