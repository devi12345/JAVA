package OOPConceptsPart1;

public class MethodOverloadingJava {

	public static void main(String[] args) {
		
		//Main method can be overloaded.
		//We can create another MAIN method but with different parameters.
		//Since the below Methods are non-static; create the object of it.
		MethodOverloadingJava obj=new MethodOverloadingJava();
		
obj.sum();
obj.sum(10);
obj.sum(10,20);
obj.sum("Devi");


	}
	
	//2nd Main method with different datatype
	public static void main(int i) {
		
	}
	
	public static void main(int i, int p) {
		
	}
	
	
	//We can Overload Main method as well but not generally used
	//MethodOverloading-- when the method name is same with different arguments or input parameters within the same class.
	// You cannot create a method inside a method.
	public void sum() { //0 Input Parameter
		System.out.println("Hello");
	
	}

	
	public void sum(int i) { //1 Input Parameter
		System.out.println(i);
	
	}
	
	public void sum(String s) { //1 Input Parameter but different datatype.
		System.out.println(s);
	
	}
	
	
	public void sum(int n, int k) {	//2 Input Parameter
		int m= n+k;
		
		System.out.println(m);
	
	}
}
