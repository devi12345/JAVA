package JavaBasic;

public class LoopsConcept {

	public static void main(String[] args) {
		
		
	//This concept will print numbers from 1 to 10
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
//************************************************
	//This concept will print numbers from 10 to 1 using For loop
		System.out.println("Backwards from 10 to 1");
		for(int j=10; j>=1; j--) {
			System.out.println(j);
			
		}
			
//************************************************		
		
		System.out.println("**********");
	// While Loop - print numbers from 1 to 10
	//Dis-advantage of while loop -- goes into infinite loop if you dont give incremental part.
		
		int a=1; //Initialization
		while(a<=10) { //Conditional
			
		System.out.println(a);
		a=a+1; //Incremental or decremental
		}
		
		
		

	}

}


