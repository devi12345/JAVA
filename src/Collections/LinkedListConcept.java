package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		//The type LinkedList is not generic; it cannot be parameterized with arguments <String>;;; got this error...change the class name from LinkedList to something else
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("Hello");
		ll.add("Hell");
		ll.add("Hel");
		ll.add("He");
		ll.add("H");
		
		System.out.println("Contents of LinkedList :" + ll);

		//addFirst
		ll.addFirst("QA");
		
		//addLast
		ll.addLast("Automation");
		
		System.out.println("Contents of LinkedList :" + ll);
		
		//get Value
		System.out.println(ll.get(0));
		
		//Set value
		ll.set(0, "Testing");
		System.out.println(ll.get(0));
		
		//removeFirst
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of LinkedList :" + ll);
		
		ll.remove(4);
		System.out.println("Contents of LinkedList :" + ll);
		
		//How to print all the values of LinkedList
		//1. Using For loop
		//2. Advance For Loop
		//3. Iterator
		//4. While Loop
		
		
		//For Loop
			System.out.println("****Using For Loop");
			for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
			}
		
		//Advance For Loop
			System.out.println("****Advance For Loop");
			for(String str:ll) {
			System.out.println(str);	
			}
		
		//Iterator
			System.out.println("****Iterator");
			Iterator<String> it= ll.iterator();
			while(it.hasNext()) {
			System.out.println(it.next());
			}
			
		// While Loop
			System.out.println("****While Loop");
			int k=0;
			while(ll.size()>k) {
			System.out.println(ll.get(k));	
			k++;
			}
			
			
			
	}

}
