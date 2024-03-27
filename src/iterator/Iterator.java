package iterator;

/**
 * Define an iterator
 * @param <T> T the type of the object in the collection we iterate over
 *
 *  Java already propose iterator and implements iterator,
 *  here we implement the example to understand how tan iterator and the iterator pattern work
 */
public interface Iterator<T> {
    public boolean hasNext();
    public T next();
}
