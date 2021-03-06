package data.structures.queues;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * Class which implements a Queue for handling generic objects
 */
public class ProcessQueue<E> implements Queue<E> {

	/**
	 * Private class of internal uses for the ProcessQueue
	 * @param <E> represents a generic object
	 */
	private class Node<E>{
		
		public E element;
		
		public Node next;
		
		public Node(E element) {
			this.element = element;
		}

	}

	private Node head, last;

	/**
	 * Construct an empty queue
	 */
	public ProcessQueue() {
	}

	/**
	 * Put an element at the end of the queue
	 * @param e receives an generic object
	 */
	@Override
	public void put(E e) {
		
		Node newNode = new Node(e);
		if(head == null) {
			head = newNode;		
		}else{
			last.next = newNode;
		}
		last = newNode;
	}

	/**
	 * Delete the last element from the queue
	 */
	@Override
	public void delete() {
		if(head!=null) {
			Node delete = head;
			head = head.next;
			delete.next = null;
			if(head==null) {
				last = null;
			}
		}
		
	}

	/**
	 * Get an element from the head of the queue
	 * @return the generic object
	 */
	@Override
	public E get() {
		if(head==null){
			return null;
		}else {
			return (E) head.element;
		}
		
	}

}
