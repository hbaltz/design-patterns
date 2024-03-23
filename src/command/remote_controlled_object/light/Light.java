package command.remote_controlled_object.light;

/**
 * Modeled a remote controlled light
 */
public class Light {
    private final String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("The light in "+ location + " has been switched on!");
    }

    public void off() {
        System.out.println("The light in "+ location + " has been switched off!");
    }
}
