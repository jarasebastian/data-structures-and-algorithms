package data.structures.lists;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * Implementation of a Linkedlist in Java
 * which uses Generics to manage objects type elements
 */
public class LinkedList<E> implements List <E>{

	/**
	 * Private class internally used by LinkedList to manage its nodes
	 * @param <E> is a generic object to be manage as a linkedlist
	 */
	private class Node<E> {

		public Node previous;
		public Node next;
		public E element;

		public Node(Node previous, Node next, E element) {
			this.previous = previous;
			this.next = next;
			this.element = element;
		}

	}

	/**
	 * Constructs an empty list.
	 */
	public LinkedList() {
	}

	private Node head = null;
	private int length = 0;

	/**
	 * Internal and private method which get a node
	 * from any specific position
	 * @param pos indicates the position of node to be returned
	 * @return a Node type from a position previously indicated
	 */
	private Node getNode(int pos) {
		if(pos>=0 && pos<=length) {
			if(pos==length){
				return head;
			}else {
				int cont = length-1;
				Node pointer = head.previous;
				while(cont!=pos) {
					pointer = pointer.previous;
					cont--;
				}
				return pointer;
			}
		}else {
			return null;
		}
	}

	/**
	 * Add an element at the end of the list
	 * @param element is a generic object to be saved
	 */
	@Override
	public void add(E element) {

		if(isEmpty()) {
			head = new Node(null, null, element);
			this.length++;
		}else {
			Node previous = head;
			head = new Node(previous, null, element);
			this.length++;
		}
	}

	/**
	 * Add an element to a specific position of the list
	 * @param pos indicates the position where the element should be inserted
	 * @param element represents a generic object to be saved
	 * @return a boolean type true or false according to the result of the insertion
	 */
	@Override
	public boolean add(int pos, E element) {

		if(pos>=0 && pos<=length) {
			if(length==0) {
				head = new Node(null, null, element);
				this.length++;
			}else {
				Node previous = getNode(pos).previous;
				Node next = getNode(pos);
				Node pointer = new Node(previous, next, element);
			}
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Removes an element from the end of the list
	 * @return a boolean type true or false according to the result of the deletion
	 */
	@Override
	public boolean remove() {

		if(!isEmpty()) {
			head.element = null;
			head = head.previous;
			head.next = null;
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Removes an element from a specific position of the list
	 * @param pos is the position passed as a input parameter
	 * @return a boolean type true or false according to the result of the deletion
	 */
	@Override
	public boolean remove(int pos) {

		if(pos>=0 && pos<=length) {
			if(pos==length){
				head.element = null;
				if(head.previous!=null) {
					head = head.previous;
					head.next = null;
				}
			}else {
				int cont = length-1;
				Node pointer = head.previous;
				while(cont!=pos) {
					pointer = pointer.previous;
					cont--;
				}
				pointer.element = null;
				Node next = pointer.next;
				Node previous = null;
				if(pointer.previous!=null) {
					previous = pointer.previous;
					previous.next = next;
				}else {
					next.previous = null;
				}
			}
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Gets an element from a specific position gave
	 * @param pos represents the position of the element asked
	 * @return a generic object
	 */
	@Override
	public E get(int pos){
		return (E) getNode(pos).element;
	}

	/**
	 * Gets the las element from the list
	 * @return a generic object
	 */
	@Override
	public E getLast(){
		return (E) head.element;
	}

	/**
	 * Validates if the list is empty
	 * @return a boolean type true or false according if the list is empty or not
	 */
	@Override
	public boolean isEmpty(){
		return this.length==0;
	}

	/**
	 * Shows the length of the list
	 * @return an integer with the length of the list
	 */
	@Override
	public int size() {
		return length;
	}
	
}
