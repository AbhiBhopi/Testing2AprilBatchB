package Array;

public class Array1 {
	
	public static void main(String[] args) {

	String ar [] = new String[5];  // Array declaration 
	
	ar [0] = "JAVA";
	ar [1] = "Automation";
    ar [2] = "Manual";
	ar [3] = "API";
	ar [4] = "SELENUM";
//	ar [5] = "Default";         // Array out of bound Exception when we increase limit
	
	System.out.println(ar[0]);  // with the help of index array call
	
	System.out.println("------------Print All Information in Array-----------------");
	
	for (int i =0; i <=4; i++) {   // array calling
	System.out.println(ar[i]);
		
	}
	

}
}