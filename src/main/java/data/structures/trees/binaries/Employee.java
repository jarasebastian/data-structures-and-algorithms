package data.structures.trees.binaries;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 */
public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private	String position;
	private String area;

	public Employee(int id, String name, String position, String area) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Employee{id=" + this.id + ", name=" + this.name + ", position=" + this.position + ", area=" + this.area + "}";
	}
	
	@Override
	public int compareTo(Employee empl) {
		if(id == empl.id) {
			return 0;
		}else if(id < empl.id){
			return -1;
		}else {
			return 1;
		}
	}

}
