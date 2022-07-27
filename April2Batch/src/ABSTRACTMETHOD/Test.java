package ABSTRACTMETHOD;

public class Test implements velo{   // interface property are implemented
	
	
	public void Q1() {                        // method from interface completed here
		System.out.println("Q1 is running");
		
	}
	
	public void Q2() {
		System.out.println("Q2 is running");         // method from interface completed here
		
	}
	
	public static void main(String[] args) {
		Test x = new Test();              // implementation class object created
		
		x.Q1();
		x.Q2();
		velo.M();            // static method of interface always call with interface name only 
	}
	

}      
