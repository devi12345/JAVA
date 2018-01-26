package JavaBasic;

public class StringConcantenation {

	public static void main(String[] args) {
			
		int a =100;
		int b=200;
		
		String x= "Hello";
		String y= "World";
		
		double c= 12.33;
		double d=10.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println("");
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		
		System.out.println("");
		System.out.println(x+y+(a+b)); //numbers to be enclosed within () for proper calculations.
		
		System.out.println("");
		System.out.println(c+d);
		System.out.println("");
		
		System.out.println(x+y+c+d);
		System.out.println("");
		
		System.out.print("Hello"); //print is generated on the same line
		System.out.println("The value of a is: " + a); //println means prints new line
	}

}
