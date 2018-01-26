package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array: Stores similar data type values in a array variable.
		
		//Int Array
		//Lowest bound index=0
		//upper bound index=n-1
		//One-dim array
		//Advantages: We can store multiple values of same datatype.
		
		//Dis-advantages of array (INTERVIEW QUESTION)
		//Size is fixed  -----to overcome this problem, we use Collections like Arraylist, Hashtable (Dynamic Array)
		//Stores only similar datatypes values -----to overcome this problem, we use Object Array
		
		int i[]=new int[4];
		double d[]= new double[2];
		char c[]=new char[3];
		String s[]=new String[4];
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		for (int j=0;j<i.length;j=j+1) { // dont use j<=i.length
			System.out.println(i[j]);
		}
		
		//************************************************	
		System.out.println("Length of Array is: " + i.length);
		//System.out.println(i[4]); // Array is out of bound; Gives Exception -  java.lang.ArrayIndexOutOfBoundsException: (INTERVIEW QUESTION)
	
		//************************************************	
		//Boolean Array
		boolean b[]= new boolean[2];
		b[0] =true;
		b[1]=false;
	
		//************************************************		
		//Object Array
		//Object is a super class of all classes.
		//Stores different data type values
		//Object is a class
		System.out.println("");
		System.out.println("Object Array");
		Object ob[]=new Object[5];
		for (int k=0;k<ob.length;k++) {
		ob[0]="Tom";
		ob[1]=26;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='M';
		System.out.println(ob[k]);
		}
		
		System.out.println("Length of Object Array : " + ob.length);
		
	}

}
