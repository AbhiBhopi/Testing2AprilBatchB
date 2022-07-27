package CASTING;

public class Explicit {
	
	
	public static void main(String[] args) {
		
		double a = 130.65;               // memory size 8 byte   
		System.out.println(a);
		
		int b = (int) a ;              // memory size 4 byte  // casting operator
		System.out.println(b);
		
		byte c = (byte)b;
		System.out.println(c);           // memory size 1 byte
		
	}

}
