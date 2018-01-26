package JavaBasic;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		
		int i=1;
		int j=i++; //post increment //Increase the value of i by 1 later;  but first give the value of i to j.
		
		System.out.println("Value of i : " + i);
		System.out.println("Post increment value:  " + j);
		
		
		int a =1;
		int b=++a; // Pre-increment
		System.out.println("");
		System.out.println("Value of a : " + a);
		System.out.println("Pre increment value:  " + b);
				
		int m=2;
		int n=m--; // post decrement
		
		System.out.println("");
		System.out.println("Value of m : " + m);
		System.out.println("Post Decrement value:  " + n);
		
		int k=2;
		int l=--k; // pre increment
		
		System.out.println("");
		System.out.println("Value of k : " + k);
		System.out.println("Post Decrement value:  " + l);
		
	}

}
