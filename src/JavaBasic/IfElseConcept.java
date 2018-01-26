package JavaBasic;

public class IfElseConcept {

	public static void main(String[] args) {
		
		
		//Comparison Operators
		// <> <= >= != ==
		int a=10;
		int b=50;
		int c=80;
		
		
		if(a>b) {
			System.out.println("a is greater");
		}
		else{
			System.out.println("b is greater");
		}
	
			if(a==c) {
			System.out.println("a is same as c");
		}
		else{
			System.out.println("a is not same as c");
		}
	
			System.out.println("");
	
	//Write a logic to print the highest number
			
		if(a>b & a>c) {
			
			System.out.println("a is greater");	
		}
		else if(b>a & b>c){
			System.out.println("b is greater");	
		}
		else {
			System.out.println("c is greater");	
		}
		
		
	}

}
