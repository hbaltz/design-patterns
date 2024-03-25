package facade.device.popcornpopper;

import facade.device.IOnOffDevice;

/**
 * Modeled a popcorn popper
 */
public class PopcornPopper implements IOnOffDevice {
    public void on() {
        System.out.println("The popcorn popper is turning on!");
    }

    public void off() {
        System.out.println("The popcorn popper is turning off!");
    }

    public void pop() {
        System.out.println("Pop pop pop!");
    }
}
