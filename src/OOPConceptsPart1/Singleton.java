package OOPConceptsPart1;

public class Singleton {

	// In OOP, Singleton is a special class which can have only one Object...only
	// single instance of the class at a time.
	// How to design Singleton class ?
	// Make Constructor as Private
	// Write a public Static Method(getInstance) that has return type of object of this Singleton
	// class(also called Lazy Initialization)

	private static Singleton sing_instance = null;
	public String str;

	// Creating a Construction of this class
	private Singleton() {
		str = "Hello";
	}

	
	public static Singleton getInstance() {
		if(sing_instance==null)
			sing_instance = new Singleton();
			return sing_instance;
	}
	
	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		y.str = (y.str).toLowerCase();
		
		System.out.println("");
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		
	}

}
