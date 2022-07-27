package Methods;

public class staticnonstatic {
	
	static int a=10;    // static variable 
	       int b=20;    // non static
	       
	       
	       staticnonstatic(){   // user define cons zero arg
	    	   a=23;
	    	   b=56;
	       }
	       staticnonstatic(int z){   // user define with arg
	    	   
	    	   a=45;
	    	   b=67;
	    	   
	       }
	       
           staticnonstatic(char u){  // user define with arg
	    	   //a=56;
	    	  }
           public static void main(String[] args) {
        	   System.out.println(a);
        	 //  System.out.println();
        	   
        	   
        	   
        	  staticnonstatic x = new  staticnonstatic(); // calling constr
        	  System.out.println(a);
        	  System.out.println(x.b);
        	   
        	   
        	   staticnonstatic z = new  staticnonstatic(89); // calling constr
        	   System.out.println(z.a);
        	   System.out.println(z.b);
        	   
        	   staticnonstatic y = new staticnonstatic('$'); // calling constr
        	   
			   System.out.println(y.a);
			   System.out.println(y.b);
		}
           
	       
	       
	      
		
}
