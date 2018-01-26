package OOPConceptsPart1;

public class ConstructorConcept {
	//Constructor is not a function even though it looks like one.
	//Default Constructor...means Zero parameters
	//This concept is called Constructor Overloading...Can we Overload a Constructor...YES
	//Constructor name and Class name shld be same.
	//Even if the Constructor is not created; Hidden Constructor called Default Constructor is available. 
	
	public ConstructorConcept() {
		System.out.println("Default Constructor");
		}
		
	public ConstructorConcept(int i) {
		System.out.println("Single Param Constructor");
		System.out.println("The Value of i:" + i);
		}
	
	public ConstructorConcept(int i, int j ) {
		System.out.println("Two Param Constructor");
		System.out.println("The Value of i:" + i);
		System.out.println("The Value of j:" + j);
		}

	public static void main(String[] args) {
	
		//We call the constructor by creating the object..by deafult it gets executed the moment we create the Object
		ConstructorConcept obj= new ConstructorConcept();	
		ConstructorConcept obj1= new ConstructorConcept(10);
		ConstructorConcept obj2= new ConstructorConcept(10,20);

	}

}
