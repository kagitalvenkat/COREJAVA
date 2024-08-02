package poly;

//Method Overloading 
public class Calculator {
	
	void add(int i1,int i2) {
		System.out.println("sumof two nums:"+(i1+i2));
	}
	
	void add(int i1,int i2,int i3) {
		System.out.println("sumof three nums:"+(i1+i2+i3));
	}
	
	public static void main(String[] args) {
		
		Calculator d = new Calculator();
		d.add(1, 2);
		d.add(1, 2,3);

	}
}
