package command.remote_controlled_object.light;

/**
 * Modeled a remote controlled light
 */
public class Light {
    private final String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("The light "+ name + " has been switched on!");
    }

    public void off() {
        System.out.println("The light "+ name + " has been switched off!");
    }
}
