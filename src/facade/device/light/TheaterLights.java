package facade.device.light;

import facade.device.IOnOffDevice;

/**
 * Modeled theater lights
 */
public class TheaterLights implements IOnOffDevice {
    public void on() {
        System.out.println("The theater lights are turn on!");
    }

    public void off() {
        System.out.println("The theater lights are turn off!");
    }

    public void dim() {
        System.out.println("The theater lights are dimming!");
    }

    public void bright() {
        System.out.println("The theater lights are brightening!");
    }
}
