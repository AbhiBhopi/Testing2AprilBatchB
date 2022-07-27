package ABSTRACTMETHOD;

public class TestGeneralization {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("************** Features of Idea*************");
		
		Idea I = new Idea();
		
		I.audiocalling();
		I.SMS();
		I.Internet();
		I.NewfeatereB();
		
		System.out.println("************** Features of JIO*************");
		
		JIO J = new JIO();
		J.audiocalling();
		J.SMS();
		J.Internet();
		J.NewfeatereA();
		
		
	}

}
