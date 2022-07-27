package Collection;

public class Test <T,L>{
	int a ;
	T b;
	// return type = generic (T) // L = Argument
	
	T Demo(L d ){
		
		System.out.println(d);
		
		return b;
	}
	
	
	
	public static void main(String[] args) {
		Test v = new Test();
		
	v.Demo("Velocity");
	v.Demo(34);
		
		
	
			
	
		
	}

}
