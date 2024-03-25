package facade.device.player;

/**
 * Modeled a physical device
 */
public interface IPlayer {
    /**
     * Play what is in the player
     */
    public void play();

    /**
     * Pause the content that is playing
     */
    public void pause();
    /**
     * Pause the content that is playing
     */
    public void stop();
    /**
     * Eject the support in the player
     */
    public void eject();
}
