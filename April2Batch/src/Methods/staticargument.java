package Methods;

public class staticargument {
	
	public static void addition(int a,int b) {  // static with arg
	
		int c = a+b;
		System.out.println("addition = "+c);
	}
	
	public void multiplication(int a,int b) {// non static with arg
		
		int c = a*b;
		System.out.println("Multiplication ="+c);
		                                          
	}
	
	public static void main(String[] args) {
		
		addition(90,100);
		
		staticargument x = new staticargument();// object for non static 
		
		x.multiplication(10, 2);
		
	}
	
		
}
