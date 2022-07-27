package CASTING;

public class Testcasting {
	
	
	public static void main(String[] args) {
		
		father f = new son();    // up casting syntax  
		
		f.money();
		f.car();
		
		
		father d = new father();
		
		d.car();
		d.money();
	}

}
