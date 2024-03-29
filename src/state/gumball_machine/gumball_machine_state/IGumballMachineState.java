package state.gumball_machine.gumball_machine_state;

/**
 * Model a state of the gumball machine, map all the action that could happen to the machine to methods
 */
public interface IGumballMachineState {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
    public void fill();
}
