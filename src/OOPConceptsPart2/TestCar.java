package OOPConceptsPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//Whenever the Method is common in Parent and Child Class; in this case...Start Method; preference is given to Child Class Method
		//Method Overriding; when same method is present in Parent and Child class with the same name and same no of arguments.

		//method overloading--->static/compile time polymorphism
		//Method Overriding--->Dynamic Polymorphism
		
		// Compile Time Polymorphism or Static Polymorphism
		//Name Compile Time because; at the time of Compilation JAVA will decide which Method to call.
		//Polymorphism means Method OverRiding
		
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("");
		System.out.println("Calling Vehicle ");
		Vehicle v= new Vehicle();
		v.engine();
		
		
		System.out.println("");
		//Child can inherit the properties but not the Parent; hence theftSafety Method is not available in Car class.
		System.out.println("Calling CAR Method");
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		
		System.out.println("");
		System.out.println("C1 Car");
		
		//Top Casting ...casting of BMW class object referred by parent class reference variable.
		Car c1=new BMW(); //Child class object can be referred by parent class reference variable - dynamic polymorphism or Run-time Polymorphism
		
		//Only overridden Methods and Parent Methods are called...not the child, here we cannot access theftSafety Method.
		//We are creating a reference of Parent Class C1.
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down Casting
		//Not Allowed, Parent cannot be fit into Child class Variable
		//BMW b1=new Car();
		
		//Down Casting
		//Casting the car into BMW car.
		//Two Stages of executiom...Compile Time and Run time...at Run time, JAVA will get confused and give you error  java.lang.ClassCastException
		//BMW b1=(BMW)new Car();
		
		
	}

}
