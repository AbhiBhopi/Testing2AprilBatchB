package Methods;

public class overload {
	static int a =10;   // static compile
	       int s =20;
	
public static void main(int a) {  // regular / user define
		
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {   // system define
		
		System.out.println("main method is started");
		
		main(65);
		main('$');
		
	}
	
	
	
	public static void main(char x) { // user define
		System.out.println(x);
		
	}
	
	

}
