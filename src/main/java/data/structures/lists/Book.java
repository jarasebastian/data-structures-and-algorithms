package data.structures.lists;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * Test class for being consumed by a LinkedList
 */
public class Book {
	
	private String name;
	private String author;
	private int pagesQuantity;

	public Book(String name, String author, int pagesQuantity) {
		this.name = name;
		this.author = author;
		this.pagesQuantity = pagesQuantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPagesQuantity() {
		return pagesQuantity;
	}

	public void setPagesQuantity(int pagesQuantity) {
		this.pagesQuantity = pagesQuantity;
	}
}
