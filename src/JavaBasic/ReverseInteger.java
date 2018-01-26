package JavaBasic;

public class ReverseInteger {

	public static void main(String[] args) {
		
		//1. Using algo
		
		long num=12345;
		long rev=0;
		
		
		while(num!=0) {
			
			rev=rev * 10  + num % 10; //if you divide 12345 by 10...remainder will be 5 
			System.out.println(rev);
			num=num/10; //dividing 12345 by 10......gives 1234..Quotient
			}
		
		System.out.println("Reverse Num is:::" + rev);
		
		
		
		//2 Using String Buffer Method
		
		long num1=12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse()); ///String.valueof, will convert the long to String

	}

}
