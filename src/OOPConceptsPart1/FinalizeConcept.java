package OOPConceptsPart1;

public class FinalizeConcept {
	
	//Final is the Keyword
	//Finally is the block
	//Finalize is the Method
	
	//Concept called as Garbage Collector will come inside the memory; it will destroy the Objects that doesnt have any reference.

	public void finalize() {
		System.out.println("Finalize Method");
		}
	
	//Just before the Object is Garbage collected;automatically Finalize method is called for cleanup processing of the object.
	
	public static void main(String[] args) {
		
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2= new FinalizeConcept();
		
		
		f1=null;
		f2=null;
		
		//Calling Garbage Collector..collect all the objects and kill which doesnt have any reference 
		//Before gc()..finalize method will be called for some cleanup processing..just before the object is garbage collected.
		System.gc();
		

	}

}
