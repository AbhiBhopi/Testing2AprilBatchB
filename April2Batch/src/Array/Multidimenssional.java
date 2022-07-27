package Array;

public class Multidimenssional {
	public static void main(String[] args) {
		
	                            //   0 1
	//a= {10,20}{30,40}            0   10 20
	                              //  1  30 40
	//int ar[]=new int [3];
	
	int ar [][]= new int [2][2];
	
	ar [0][0]	=10;
	ar [0][1]	=20;
	ar [1][0]	=30;
	ar [1][1]	=40;
	
	System.out.println(ar[0][1]);
	
	for (int i=0;i<=1;i++) {
		for(int j=0;j<=1;j++) {
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
