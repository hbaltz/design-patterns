package command.remote_controlled_object.ceiling_fan;

/**
 * Modeled a remote controlled ceiling fan
 */
public class CeilingFan {
    private final String location;

    private CeilingFanSpeed speed = CeilingFanSpeed.OFF;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        speed = CeilingFanSpeed.HIGH;
    }

    public void medium() {
        speed = CeilingFanSpeed.MEDIUM;
    }

    public void low() {
        speed = CeilingFanSpeed.LOW;
    }

    public void off() {
        speed = CeilingFanSpeed.OFF;
    }

    public CeilingFanSpeed getSpeed(){
        return speed;
    }
}
