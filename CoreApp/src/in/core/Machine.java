package in.core;

//abstract class 
abstract class DieselMachine {
	public DieselMachine() {
		// TODO Auto-generated constructor stub
		System.out.println("DieselMachine constructor");
	}
	public void start() {
		System.out.println("Machine Starting ....");
	}

	public abstract void fillFuel();

}

public class Machine extends DieselMachine {

	public Machine() {
		// TODO Auto-generated constructor stub
		System.out.println("Machine class constructor");
	}

	@Override
	public void fillFuel() {
		// TODO Auto-generated method stub
		System.out.println("Fuel filled.......");
	}

	public static void main(String[] args) {
		Machine machine = new Machine();
		machine.start();
		machine.fillFuel();
	}

}
