package command.remote_controlled_object.garage_door;

/**
 * Modeled a remote controlled garage door
 */
public class GarageDoor {
    private final String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("The garage door "+ name + " is going up!");
    }

    public void down() {
        System.out.println("The garage door "+ name + " is going down!");
    }

    public void stop() {
        System.out.println("The garage door "+ name + " is stopping!");
    }

    public void lightOn() {
        System.out.println("The light of the garage door "+ name + " has been switched on!");
    }

    public void lightOff() {
        System.out.println("The light of the garage door "+ name + " has been switched off!");
    }
}
