package OOPConceptsPart1;

public final class FinalConcept {

	//Child cannot inherit the properties of this class...as it is defined as a final..means we cannot use extends
	//To avoid the Inheritance we use Final Keyword
	//to prevent Method overriding
	
	public static void main(String[] args) {
		
		//Final Keyword
		
		//Means once assigned the value; we cannot change it; defines constant values
		
		final int i=-10;
		//i=20;   Not possible
		
		System.out.println(i);;
		
		
		
		
		

	}

}
