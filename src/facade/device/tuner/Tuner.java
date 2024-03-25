package facade.device.tuner;

import facade.device.IOnOffDevice;

/**
 * Modeled a tuner
 */
public class Tuner implements IOnOffDevice {
    @Override
    public void on() {
        System.out.println("The tuner is turning on!");
    }

    @Override
    public void off() {
        System.out.println("The tuner is turning off!");
    }

    public void setAm() {
        System.out.println("The tuner is set to AM!");
    }

    public void setFm() {
        System.out.println("The tuner is set to FM!");
    }

    public void setFrequency(double frequency) {
        // Here we should verify the frequency is in range and keep store in some variable
        // For the example, we will keep it simple
        System.out.println("The tuner is set to " + frequency + "Hz");
    }
}
