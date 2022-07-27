package Inheritance;

public class abhi2 extends abhi1 {                       // concrete class
	
	 public  void show() {                              // complete method declare body
		 
		 System.out.println("running show method");
		 
		 
	 }
	 
	 public void blank() {                               // complete method declare body
		 
		 System.out.println("running blank method");
	 }
	 
	 public static void main(String[] args) {
		 abhi2 a = new abhi2();
		 a.display();
		 a.show();
		 a.blank();

	}

}
