package Inheritance;

public class TestmultiInheritance implements A,B{
	
	public void Q1() {
		
		System.out.println("Q1 run");
	}
public void Q2() {
		
		System.out.println("Q2 run");
	}
 public void Q1(int a) {
	
	System.out.println("Q3 run");
}
public void Q2(int b) {
	
	System.out.println("Q4 run");
}
 public static void main(String[] args) {
	 
	 TestmultiInheritance x = new TestmultiInheritance();
	 x.Q1();
	 x.Q2();
	 x.Q2();
	 x.Q1();
	
}

}
