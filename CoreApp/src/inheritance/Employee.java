package inheritance;

public class Employee extends User {
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Employee constructor");
	}

	public Employee(int id,String name) {
		System.out.println("Parent class param -constuructor ");
	}

	int rank;

	public static void main(String[] args) {
		Employee e = new Employee();
		e.m1();
		e.name = "RUDRA";
		e.age = 22;
		System.out.println(e.name + " :" + e.age);
		System.out.println("===================");

		User user = new User();
		user.name = "PAVAN";
		user.age = 23;
		// user.rank =1; //invalid -can't access child class props

		// System.out.println(user.name+" -> "+user.age+" -> "+user.rank);
		System.out.println(user.name + " -> " + user.age);
		
		
		System.out.println("--------------------------------");
		Employee e2 = new Employee(11,"Pavan");

	}
}
