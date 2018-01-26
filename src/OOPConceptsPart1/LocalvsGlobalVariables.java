package OOPConceptsPart1;

public class LocalvsGlobalVariables {
	//Global variables are class variables
	//Scope of Global Variables is available throughout the program.
	String name="Tom";
	int age=25;
	
	//separate memory is given to main method.
		public static void main(String[] args) {
	
		//To access Global variables, we have to create the object of that class.
		LocalvsGlobalVariables obj=new LocalvsGlobalVariables();
		System.out.println(obj.name);
		int i=10; //Local Variables
		
		System.out.println(i);
		
		obj.sum(); // calling method sum() / non-static method calling
	}
	
	
	public void sum() {
		LocalvsGlobalVariables obj=new LocalvsGlobalVariables();
		int i=10; //Local Variables
		int j=20; //Local Variables
		System.out.println(obj.age);
	}

}
