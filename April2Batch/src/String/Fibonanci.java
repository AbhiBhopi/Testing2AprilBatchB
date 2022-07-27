package String;

public class Fibonanci {  //0 1 1 2 3 5 8 13 21 34
	
	
	public static void main(String[] args) {
		int a =0;
		int b =1;
		int c=15;   // this 10 shows us that our series count is upto 10 numbers.
		int i;
		int d;
		
		System.out.print(a+" "+b);
		
		for ( i=2;i<c;i++) {
			
			d = a + b ;
			System.out.print(" "+d);
			a=b;
			b=d;
			
			
		}
	}
	
	

}
