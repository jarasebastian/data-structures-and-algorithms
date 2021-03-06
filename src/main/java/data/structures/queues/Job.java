package data.structures.queues;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * Test class for being consumed by a ProcessQueue
 */
public class Job {

	private String title;
	private String author;
	private boolean printed;
	
	public Job(String title, String author) {
		this.title = title;
		this.author = author;
		this.printed = false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isPrinted() {
		return printed;
	}

	public void setPrinted(boolean printed) {
		this.printed = printed;
	}
	
	 
}
