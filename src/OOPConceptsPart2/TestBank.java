package OOPConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank HS=new HSBCBank();
		
		HS.credit();
		HS.debit();
		HS.transferMoney();
		HS.educataionLoan();
		HS.carLoan();
		HS.mutualFund();
		
		//You cannot change the value of min_bal(Interface Variable)
		System.out.println(USBankInterface.min_bal);
		
		//Dynamic Polymorphism
		//Child class object can be referred by parent interface reference variable.
		//only overridden methods will be called.
				
		USBankInterface usb = new HSBCBank();
		usb.credit();
		usb.debit();
		usb.transferMoney();
		
	}

}
