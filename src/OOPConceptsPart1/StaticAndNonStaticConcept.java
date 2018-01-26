package OOPConceptsPart1;

public class StaticAndNonStaticConcept {
	//Global Variables: scope of the global variables is available across the function with some condition.
	String name="Tom"; //Non-static Global Variable
	static int age=25; //static Global variable

	public static void main(String[] args) {
		
		
		//Static Methods and Variables are not given to object.
		//How to call static methods and variables?
		
		System.out.println("How to call Static Methods");
		//1. Direct calling of Static Methods
		sum();
		//2. Calling using class name of Static Method
		StaticAndNonStaticConcept.sum();
		
		System.out.println("");
		
		System.out.println("How to call Global Variables");
		System.out.println(age); //Calling Static Variables directly
		System.out.println(StaticAndNonStaticConcept.age);//Calling Static Variables using class name
		
		System.out.println("");
		System.out.println("How to call Non-Static Method & Variable");
		//How to call nonstatic methods and variables?
		StaticAndNonStaticConcept obj= new StaticAndNonStaticConcept();
		obj.sendmail();
		System.out.println(obj.name);
		
		//Can i access static method using obj reference...yes but with warning..since its freely available
		//in java memory hence there is no need to use obj reference.
		obj.sum();
		
	}

	
	public void sendmail() { //non-static method 
		System.out.println("Send Mail");
	}
	
	
	public static void sum() { // static method
		System.out.println("Static Method");
	}
	
	
	
}
