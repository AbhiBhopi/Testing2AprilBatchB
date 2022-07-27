package ABSTRACTMETHOD;

public class Testdefault1 implements velo1{   // one new implementation class 
	
	
	public void mart() {          // completed this method comes from interface
		System.out.println("all shops open");
		
	
	}
	
	public static void main(String[] args) {
		Testdefault x = new Testdefault();        // object of implementation class
		Testdefault1 y = new Testdefault1();      // object of implementation class
		
		
		x.Dmart();
		x.mart();
		
		y.Dmart();
		y.mart();
		
	}

}
