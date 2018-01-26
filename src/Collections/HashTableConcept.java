package Collections;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		//Collection
		//Dynamic Array
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Hello");
		h.put("B", "Hell");
		h.put("C", "Hel");
		h.put("D", "He");
		h.put("D", "Hee");
		
		System.out.println("Size :" + h.size());
		
		//remove 
		h.remove("D");
		System.out.println("Size :" + h.size());
		
		h.put("E", "H");
		h.put(1, "Devi");
		
		System.out.println("Size :" + h.size());
		
		System.out.println("Value at 1: " + h.get(1));
		System.out.println("Value at D: " + h.get("D"));
		

		//Specific DataType
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		h1.put(2, 20);
		h2.put(3, "Devi");
		System.out.println("Value at 2: " + h1.get(2));
		
		
	}

} 
