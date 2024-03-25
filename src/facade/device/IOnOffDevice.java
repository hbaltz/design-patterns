package facade.device;

/**
 * Modeled a device that can be turn on and turn off
 */
public interface IOnOffDevice {
    /**
     * Turn the device on
     */
    public void on();

    /**
     * Turn the device off
     */
    public void off();
}
