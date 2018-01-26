package OOPConceptsPart1;

public class ConstructorWithThisKeyword {
	
	//Class  or Global variables
	
	String name;
	int age;
	
	
	
	public ConstructorWithThisKeyword(String name, int age) {
		//this.global Variable = local Variable
		this.name =name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {
	
		ConstructorWithThisKeyword obj= new ConstructorWithThisKeyword("Navi",9);
		
			

	}

}
