package String;

public class swapping {
	
	public static void main(String[] args) {
		int a[]= {45,67,87,65,32,90,78};
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
		
	//	a[0]= a[5]; lastIndex -0
	//	a[1]= a[4];  lastIndex -1
	//	a[2]=a[3];  lastIndex-2
		
		for (int i=0;i<(a.length/2); i++) {
			int z;
			z=a[i];
			a[i]=a[(a.length-1)-i];
			a[(a.length-1)-i]=z;
			
		}
		
		System.out.println();
		
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}
			
		
		
	}


