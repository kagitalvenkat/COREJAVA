package in.block;

public class BlockDemo {
	{	//instance block is executed automatically when the object is created
		System.out.println("Instance Block");
	}
	static {//static block and method is executed at the time of class loading
		System.out.println("Static - Block");
	}
	public static void main(String[] args) {
		System.out.println("main() method");
		
		BlockDemo demo = new BlockDemo();
	}
}
