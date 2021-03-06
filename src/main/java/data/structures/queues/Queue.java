package data.structures.queues;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * Interface which defines the behaviour of the Queues implementations
 */
public interface Queue<E> {

	void put(E t);
	
	void delete();
	
	E get();
}
