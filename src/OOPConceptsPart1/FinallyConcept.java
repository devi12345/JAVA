package OOPConceptsPart1;

public class FinallyConcept {
	//Finally keyword is used with try catch block
	//Finally block will be executed after try catch block.

	public static void main(String[] args) {
		//test1();
		//test2();
		div();
		//div1();
	}
	
	public static void test1(){
		try {
			System.out.println("Inside Test1 Method");	
			throw new RuntimeException("aaa");	
		}catch(Exception e) {
			System.out.println("Inside Catch Block");
		}
	
	
	finally
	{
	System.out.println("Inside Finally Block");
	}
	
	}
	
	//
	public static void test2() {
		try {
			System.out.println("Inside Test2");	
			}
		
		finally
		{
		System.out.println("Inside Finally test2 Block");
		}

}
	
	//
	public static void div() {
		
		int i=10;
		try {
			System.out.println("Inside try block");	
			int k=i/0; //We cannot divide any value by 0 according to JAVA; it will give you arithmetic exception
			}catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception");
				System.out.println("Divide by 0 Error");
			}
		
		
		finally
		{
		System.out.println("Inside Div");
		}
	}

	//In this case, we r using a Wrong Exception(NullPoint) even though we know that its an Arithmetic Exception..it will not enter the Catch block.
	//INTERVIEW QUESTION
		public static void div1() {
			
			int i=10;
			try {
				System.out.println("Inside try block");	
				int k=i/0; //We cannot divide any value by 0 according to JAVA; it will give you arithmetic exception
				}catch(NullPointerException e) {
					System.out.println("Arithmetic Exception");
					System.out.println("Divide by 0 Error");
				}
			
			
			finally
			{
			System.out.println("Inside Finally Div");
			}	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}