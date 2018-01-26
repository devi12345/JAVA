package OOPConceptsPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
	//Wrapper classes are using for conversion.
		
   //data conversion string to int	
	String s="100";
	System.out.println(s+20);
	
	int i=Integer.parseInt(s);
	System.out.println(i+20);	
	
	
	//data conversion string to double
	String ss="10.33";
	System.out.println(ss+20);
	
	double d=Double.parseDouble(ss);
	System.out.println(d+20);	
	
	//data conversion string to char
	//No parsing method for character
	
	//data conversion string to boolean
	String sss="true";
	System.out.println(sss);
	
	boolean b=Boolean.parseBoolean(sss);
	System.out.println(sss);
	
	//int to String conversion
	int a = 20;
	String s4= String.valueOf(a);
	System.out.println(s4+4);
	
	//data conversion of alpanumeric value, gives error 
	//Exception in thread "main" java.lang.NumberFormatException: For input string: "100a"
	
	String o="100a";
	
	int oo=Integer.parseInt(o);
	System.out.println(oo+100);
	
	}

}
