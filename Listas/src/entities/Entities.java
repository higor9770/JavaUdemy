package entities;

public class Entities {

	private Integer id;
	private String name;
	private double salary;
	
	public Entities() {
	}
	
	public Entities(Integer id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public double getSalary() {
		return salary;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary + salary * percentage/100;
		
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
}
