package JavaBasic;

public class ReverseString {

	public static void main(String[] args) {

		// Interview Questions:
		// Reverse a String
		// Difference between String and String Buffer(Java class)
		// Do we have a reverse function in a String : Answer: no

		String s = "Hello World";
		int len = s.length();

		String rev = "";

		// 1. Using For loop

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}

		System.out.println("****************");
		System.out.println("Using For Loop : " + rev);

		// 2 Using String Buffer Class

		StringBuffer sf = new StringBuffer(s);
		System.out.println("****************");
		System.out.println("Using String Buffer : " + sf.reverse());

		// 3 Devi
		String s1 = "Hello Devi";
		StringBuffer rev1 = new StringBuffer(s1).reverse();
		System.out.println(rev1);

	}

}
