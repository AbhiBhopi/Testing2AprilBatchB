package Inheritance;

public class Test implements A{  // static method from interface
	
	
	public void Q1() {
		System.out.println("ABC");
	}
	
	public void Q2() {
		System.out.println("xyz");
	}
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.Q1();          // method from interface
		t.Q2();           // method from interface
		A.L();            // static method from interface call with interface name only
		
		}

	
	
	}


