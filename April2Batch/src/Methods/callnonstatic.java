package Methods;

public class callnonstatic {
	
	public static void main(String[] args) {
		System.out.println("main method started");
	
		main(100);
		main('x');
		}
	
	public static void main(int a) {
		System.out.println(a);
		
	}
	
	public static void main(char ch) {
		System.out.println(ch);
		
	}

}
 