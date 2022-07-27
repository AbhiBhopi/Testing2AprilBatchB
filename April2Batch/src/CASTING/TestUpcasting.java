package CASTING;

public class TestUpcasting {
	
	public static void main(String[] args) {
		System.out.println("********* super class object***********");
		
		upcasting x = new upcasting();
		x.demo();
		x.set();
		x.staticTest();
		
		System.out.println("********* sub class object***********");
		
		upcasting1 y = new upcasting1();
		
		y.demo();
		y.set();
		y.staticTest();  // non overide 
		y.sub();
		
		System.out.println("********* up casting ***********");
		
		upcasting z = new upcasting1();
		z.demo();
		z.set();
		z.staticTest();
		
		upcasting1 sub = (upcasting1) new upcasting();         // downcasting 
		
		sub.demo();
		sub.set();
		
		
		
		
	}
	

}
