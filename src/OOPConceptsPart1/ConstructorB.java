package OOPConceptsPart1;

//ctrl + shift+ f for formatting 

public class ConstructorB extends ConstructorA {

	// Super Keyword is used to call Parent Class Constructor otherwise default
	// constructor will be called.
	// Super Keyword should be written inside the child class constructor always.
	// It should be the first statement
	// At a time only one Super Keyword

	public ConstructorB() {
		super();
		System.out.println("Child Class");
	}

	public ConstructorB(int i) {
		super(i);
	}

	public static void main(String[] args) {

		ConstructorB obj = new ConstructorB();
		ConstructorB obj1 = new ConstructorB(10);

	}

}
