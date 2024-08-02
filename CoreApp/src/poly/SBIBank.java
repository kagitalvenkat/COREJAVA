package poly;

//some methods like to implement parent and some method don't like to implement parent methods - method overriding
class RBIBank {

	boolean checkEligibility() {
		return true;
	}

	double getHomeLoanRofi() {
		return 10.5;
	}

	double getPersonalLoanRofi() {
		return 12.65;
	}
}

public class SBIBank extends RBIBank {
	
	@Override
	double getHomeLoanRofi() {
		return 11.75;
	}

	private String applyHomeLoan() {
		boolean status = checkEligibility();
		if(status) {
			double homeLoanRofi = getHomeLoanRofi();
			String msg = " Your loan is approved with RI as :: "+homeLoanRofi;
			return msg;
		}else {
			return "you are not eligible for hom loan";
		}
		
	}

	public static void main(String[] args) {
		SBIBank bank = new SBIBank();
		bank.applyHomeLoan();
	}

}
