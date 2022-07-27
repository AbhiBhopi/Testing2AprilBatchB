package Selenium;

public class Exception2 {
	
	public static void main(String[] args) {
		int a =20;
		int b =0;
		int c=0;
		int[]d= {54,87,65,45};
		
		System.out.println("start");
		try {
		c=a/b; // risky code
		//System.out.println(d[]); /// array out of bound
		}
		catch(ArithmeticException e ) {
			// alternative code
			b=4;
			c=a/b;
			
			
			System.out.println("Alternative code");
			System.out.println("Catch block executed");
		}
		finally{
			
			System.out.println("Execution of Finally block");
			
		}
		System.out.println(c);
		System.out.println("end");// normal flow
			
	}
	
	
}

//Exception is not generated => try -finally-normal flow

//Exception generated but not handled => try - finally 

//Exception generated and handled => try - catch- finally- normal flow







