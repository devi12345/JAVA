package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		
		int a[] = new int[3]; // Static Array; size is fixed
				
				
		//Dynamic Array; size doesnt matter as we can store N number of values.
		//Dynamic Array -- ArrayList
		//Can contain Duplicate Values
		// Maintains Insertion Order..0,1,2,3,4,5...
		//Not Synchronized..its slow compared to other Collections.
		// Allows random access to fetch the elements because it stores the value on the basis of Indexes.(ar.get(3))
		//In ArrayList we can store(Primitive Datatypes like Int, char..) and Non-Primitive(String) and Objects(Employee)
		
		ArrayList ar= new ArrayList(); // Non Generic ArrayList Object as we have not defined any datatype.
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size()); //Size of Array
		
		ar.add(40);
		ar.add(50);
		ar.add(50); 
		ar.add(12.33);
		ar.add("Hello");
		ar.add('H');
		ar.add(true);
		
		
		System.out.println("Size of Array : " + ar.size());
		System.out.println("Get Single Value using Index No:" + ar.get(3)); //to get the value from an Index.
		
		//To print all the values from ArrayList, we use For loop
		System.out.println(" ");
		System.out.println("All the Values of Array : ");
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
			}
		
		
		//Non Generic vs Generic
		//Generic word is available only after JDK 1.5
		ArrayList<Integer> ar1= new ArrayList<Integer>(); //Generic Array List as we have defined the datatype and we dont see any Warning as well.
		ar1.add(10);
		
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("Hello");
		
		ArrayList<E> ar3= new ArrayList<E>(); // If you are not sure of datatype...use E
		
		//Employee Class Objects
		//How to store specific User Defined Class Objects in Array List - INTERVIEW QUESTION
		//1. First Create a Constructor with class Employee
		//2. Store in ArrayList using add
		//3. Use Iterator to print all the values
		
		Employee e1= new Employee("Navi", 9, "Science");
		Employee e2= new Employee("Teju", 3, "Pony");
		Employee e3= new Employee("Laasya", 9, "Maths");
		
		
		//create ArrayList
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator to traverse the values
		//Since its a object(Employee) we cannot use For loop; we have to use Iterator to retrieve values.
		Iterator<Employee> it = ar4.iterator();
		
		while(it.hasNext()) {
			Employee emp= it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		
		//***********************************************************************
		
		//addAll()
		//Adding 2nd list into 1st list
		ArrayList<String> ar5= new ArrayList<String>();
		ar5.add("Hello");
		ar5.add("Hell");
		ar5.add("Hel");
		
		ArrayList<String> ar6= new ArrayList<String>();
		ar6.add("He");
		ar6.add("H");
		
		ar5.addAll(ar6);
		
		System.out.println("");
		System.out.println("Add All Method");
		for (int k=0; k<ar5.size();k++) {
			System.out.println(ar5.get(k));
			
		}
		

		//***********************************************************************
		//removeAll()
		ar5.removeAll(ar6);
		
		System.out.println("");
		System.out.println("Remove All Method");
		for (int k=0; k<ar5.size();k++) {
			System.out.println(ar5.get(k));
			
		}
		

		//***********************************************************************
		//retainAll()
		//Will print common values from both
		ArrayList<String> ar7= new ArrayList<String>();
		ar7.add("Hello");
		ar7.add("Hell");
		ar7.add("Hel");
		
		ArrayList<String> ar8= new ArrayList<String>();
		ar8.add("Hello");
		ar8.add("H");
		
		ar7.retainAll(ar8);
		System.out.println("");
		System.out.println("Retain All Method");
		for (int k=0; k<ar7.size();k++) {
			System.out.println(ar7.get(k));
			
		}
		
		
	}

}
