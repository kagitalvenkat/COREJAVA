package in.core;

public class BankDemo {
	public static void main(String[] args) {
		Bank bank;
		bank = new SBIBank();	
		bank.checkBalance();	//SBI BANK -checkBalance method will be called
		bank.moneyTransfer();	//SBI BANK-moneyTransfer method will be called

		bank = new HDFCBank(); //RE-INTIALISING
		bank.checkBalance();	//HDFC BANK -checkBalance method will be called
		bank.moneyTransfer();	//HDFC BANK-moneyTransfer method will be called
		
		
	}

}
