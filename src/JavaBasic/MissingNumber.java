package JavaBasic;

public class MissingNumber {

	public static void main(String[] args) {

		// Error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
		// at JavaBasic.MissingNumber.main(MissingNumber.java:14)
		// Solution: Array indices start from 0. This means that the last element is at
		// array.length - 1
		// Change your for loop terminating condition from <= to <:

		// Only works for one missing number
		// int i[]=new int[4];

		// Algorithm
		// 1. Get the sum of numbers : total = n*(n+1)/2
		// 2 Subtract all the numbers from sum and you will get the missing number.

		int a[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };

		int totalofArray = 0;

		for (int i = 0; i < a.length; i++) {

			totalofArray = totalofArray + a[i];

		}

		System.out.println(totalofArray);

		int SumOfAllNumbers = 0;
		for (int j = 1; j <= 10; j++) {

			SumOfAllNumbers = SumOfAllNumbers + j;

		}

		System.out.println(SumOfAllNumbers);

		System.out.println("Missing Number is :::" + (SumOfAllNumbers - totalofArray));

	}

}
