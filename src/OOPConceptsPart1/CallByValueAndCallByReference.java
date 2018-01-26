package OOPConceptsPart1;

public class CallByValueAndCallByReference {

	int p;
	int q;
	
	public static void main(String[] args) {
		
		CallByValueAndCallByReference obj= new CallByValueAndCallByReference();
		int x=5;
		int y=5;
		int a1 = obj.testsum(x,y); //call by value or pass by value, copy of x, y is given to a, b but not the original values.
		System.out.println(a1);
		
		obj.p=50;
		obj.q=60;
		System.out.println("Before Swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		//since the obj is the reference only obj has to be passed while calling swap method
		obj.swap(obj);
		System.out.println("After Swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	

	
	//call by value or pass by value
	public int testsum(int a, int b) {
		// it will take only original values as this is the main one but not the copy hence the output 30
		 a=20;
		 b=20;
		int r=a+b;
		return r;
					
	}
	
	//call by reference is possible in java using OBJ reference
	//below we are passing reference variable of class CallByValueAndCallByReference and (t) is the reference variable
	public void swap(CallByValueAndCallByReference t) {
		
		int temp;
		temp=t.p; //temp=50
		t.p=t.q; //p=60
		t.q=temp;// q=50
		
		
		
	}
	
	
	
	
	
}
