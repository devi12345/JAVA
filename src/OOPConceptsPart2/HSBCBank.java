package OOPConceptsPart2;

public class HSBCBank implements USBankInterface, BrazilBankInterface {
	//Is-A relationship
	//if a class is implementing any interface then its mandatory to define or override all the methods of interface.
	//Achieving Multiple Inheritance; Multiple Parents....possible only with Interface.
	//Not possible the same with Inheritance
	//Overriding from USBankInterface
	
	public void credit() {
		System.out.println("HSBC Credit");
		}
	public void debit() {
		System.out.println("HSBC Debit");
		}
	public void transferMoney() {
		System.out.println("HSBC transferMoney");
		}
	
	//HSBC Bank Methods
	public void educataionLoan() {
		System.out.println("HSBC educataionLoan");
		}
	public void carLoan() {
		System.out.println("HSBC carLoan");
		}
	
	//BrazilBank Method
	public void mutualFund() {
		System.out.println("HSBC mutualFund");
		}
	
}