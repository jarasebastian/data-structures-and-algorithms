package data.structures.lists;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * Interface List define the behaviour of the inherited lists implementations
 */
public interface List<E> {

    void add(E element);
    boolean add(int pos, E element);
    boolean remove();
    boolean remove(int pos);
    E get(int pos);
    E getLast();
    boolean isEmpty();
    int size();

}
