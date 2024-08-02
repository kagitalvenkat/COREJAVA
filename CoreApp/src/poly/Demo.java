package poly;

public class Demo {
	public static void main(String[] args) {

		SBIBank b1 = new SBIBank();
		SBIBank b2 = new SBIBank();

		boolean bankObjStatus = b1.equals(b2);
		System.out.println("Both Banks are equal? ::" + bankObjStatus); //Object class equals methods compare the hashcode of objs

		String s1 = "RUDRA";
		String s2 = new String("RUDRA");
		boolean stringObjStatus = s1.equals(s2);
		System.out.println("Both Strings are equal? :: " + stringObjStatus);// String class equals methods compare the contents of string obj 
	}
}
