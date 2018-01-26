package OOPConceptsPart1;

public class Car {
//Class variables, these properties will be given to each and every object.
	int mod;
	int wheel;
	
	
	public static void main(String[] args) {
		
		//new Car() is the object of Car class.
		//create physical entity of Car class.
		//new keyword is used to create the object.
		//a,b,c are Object reference variables
		
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		//a.mod=1994;
		//a.wheel=4;
		
		//b.mod=1995;
		//b.wheel=5;
		
		//c.mod=1996;
		//c.wheel=6;
		System.out.println("Before assigning the References");
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		System.out.println("  ");
		
		System.out.println("After Shifting the References");
		a=b;
		b=c;
		c=a;
		a.mod=10;
		System.out.println(b.mod); //0
		System.out.println(c.mod); //10
		System.out.println(a.mod); //10
		c.mod=20;		
		System.out.println(a.mod); //20
		System.out.println(c.mod); //20
		System.out.println(b.mod); //0
		b.mod=5;
		System.out.println(b.mod); //5
		System.out.println(c.mod); //20
		
	}

}
