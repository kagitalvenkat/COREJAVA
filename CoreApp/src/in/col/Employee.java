package in.col;

public class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
