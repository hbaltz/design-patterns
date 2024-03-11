package observer;

/**
 * `Modeled a subject
 */
public interface ISubject {
    public void registerObserver(IObserver observer);
    public void removeObserver(IObserver observer);

    /**
     * This method is called to notify all observers when the Subject's state has changed.
     */
    public void notifyObservers();
}
