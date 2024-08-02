package poly;

//if the class is final , cannot extend that class
public class FinalDemo {
	
	//final variables are noting but constants, can't be modified
	final String USER_NAME = "RUDRA";
	
	// we can't override
	final void getName(int id) {
		if(id == 101)
		System.out.println("Name is RUDRA");
	}
	public static void main(String[] args) {
		
	}
}
