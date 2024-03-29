package state.gumball_machine.gumball_machine_state;

/**
 * Models a state of the gumball machine, map all the action that could happen to the machine to methods
 */
public interface IGumballMachineState {
    /**
     * Defines what happens when we insert a quarter
     */
    public void insertQuarter();
    /**
     * Defines what happens when we eject a quarter
     */
    public void ejectQuarter();

    /**
     * @return true if turning the crank dispense a gumball false else
     */
    public boolean turnCrank();
    /**
     * Defines what happens when we dispense a gumball
     */
    public void dispense();
    /**
     * Define what happens when we fill the machine
     */
    public void fill();
}
