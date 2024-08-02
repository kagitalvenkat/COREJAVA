package in.core;

public interface Bank {
	
	
	public void homeLoanRofi();
	public void goldLoanRofi();
	public void personalLoanRofi();
	
	/* Interface methods are abstract - above methods internally created like below
	 * public abstract void homeLoanRofi(); 
	 * public abstract void goldLoanRofi();
	 * public abstract void personalLoanRofi();
	 * 
	 * Once interface is created then anybody can provide implementation for the interface
	 * implementing interface means overriding 'interface abstract methods'
	 * To implement a interface we will use 'implements' keyword
	 */


}
