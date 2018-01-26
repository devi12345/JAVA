package JavaBasic;

public class TwoDimArray {

	public static void main(String[] args) {
		
		//Two-Dim Array
		//0,1,2,3 - rows
		//0,1,2,3 - columns
		
		//int i[]=new int[4];
		String x[] [] = new String[3][4];
		
		System.out.println("Row Length: " + x.length);// Gives total number of rows.
		
		System.out.println("Column Length : " + x[0].length);//Gives total number of columns...for each row
		System.out.println("");
		
		x[0][0] = "a";
		x[0][1] = "b";
		x[0][2] = "c";
		x[0][3] = "d";
		
		x[1][0] = "Navi";
		x[1][1] = "Teju";
		x[1][2] = "Venkat";
		x[1][3] = "Devi";
		
		x[2][0] = "e";
		x[2][1] = "f";
		x[2][2] = "g";
		x[2][3] = "h";
		
		//Print all the values of 2D Array
		
		for(int i=0;i<x.length;i++) {
		for(int j=0;j<x[0].length;j++) {
			System.out.println(x[i][j]);
		}
		}
		
		
	}
}
