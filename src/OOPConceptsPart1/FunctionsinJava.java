package OOPConceptsPart1;

public class FunctionsinJava {
	
	// main method is the starting point of execution
	public static void main(String[] args) {
		//Obj is the object reference name and its not a object, object is new FunctioninJava()
		//copy of nonstatic methods(test(), pqr(), qa(),div()) will be given to obj object.
		// object cannot hold static methods
		//Why the MAIN method is void...because we never write RETURN statement inside the main method
		
		//Write the class name , variable name; object name is obj ;  new FunctionsInJava is the object
		FunctionsinJava obj=new FunctionsinJava();
		//Object(obj) is created and copy of all non-static methods is given to this object.
		
		obj.test(); //Since its not returning any value; just call directly.
		
		int k=obj.pqr(); // Value 30 is given to this method; to print it assign it to variable and print it.
		System.out.println(k);
		
		String l=obj.qa();
		System.out.println(l);
		
		int n=obj.div(10, 5);
		System.out.println(n);
		

	}
//non static methods
	
	public void test() { //no input and no output
		System.out.println("Test Method");
	}
	
	//void means doesnt return any values; hence change it to return datatype
	public int pqr() { //no input but some output
		System.out.println("PQR Method");
		
		int a=10;
		int b=20;
		int c = a+b;
		return c;
		
	}
	
	public String qa() { //no input but some output
		System.out.println("QA Method");
	String S="Selenium";
	return S;
	
}
	
	//x, y are input parameters
	public int div(int x, int y) { //pass both input and returns output
		System.out.println("DIV Method");
		int d=x/y;
		
		return d;
	
	
}
}