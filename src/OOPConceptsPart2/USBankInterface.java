package OOPConceptsPart2;

public interface USBankInterface {

	
	//Only declaration of Method...we dont write the method body.
	//In Interface, we can declare the variables, and variables are by default Static in nature and the value of variables cannot be changed.
	// No Static Methods in Interface ...these methods are part of OOPs Concepts and Objects cannot have static methods.
	//No Main Method
	//Interfaces are abstract in nature; we cannot create the Object of Interface.
	
	int min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	
	
	
	
}
