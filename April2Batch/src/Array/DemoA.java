package Array;

import java.util.Arrays;

public class DemoA {
	public static void main(String[] args) {
		int ar [] = {10,60,30,40,20};  // {10,20,30,40,60}
		
		System.out.println("________Original Info from Array___________");
		for (int i=0;i<=ar.length-1;i++) {
			System.out.println(ar[i]);
		}
		Arrays.sort(ar);
		System.out.println("_______Array In Asscending order__________");
	    for (int i =0;i<=ar.length-1;i++) 
		{
			System.out.println(ar[i]);
			
		}
		
		System.out.println("___________ Array in Desscending Order___________");
		for (int i =ar.length-1;i>=0;i--) {
		System.out.println(ar[i]);
			
		}
		
		
	}
}
		
		
		
		
		
		
	
	
	


