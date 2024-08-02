package inheritance;

public class User {
	public User() {
		// TODO Auto-generated constructor stub
		System.out.println("User class 0-args constructor");
	}
	
	public User(int id,String name) {
		System.out.println("Child class param -constuructor ");
	}
	
	public String name;
	public int age;
	
	public void m1() {
		System.out.println("Inside User-m1() method");
	}

}
