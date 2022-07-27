package String;

public class test1 {
	
	public static void main(String[] args) {
		
		String s1 = "velocity";  // declaration of string
		String s2 = "VELOCITY";
		String s3 = "CITY" ;
		
		
		System.out.println(s1.charAt(2));// to print char at any index
		System.out.println(s2.replace("V", "J"));// to replace char
		System.out.println(s2.isEmpty()); // true or false 
		System.out.println(s2.concat(s3));
		System.out.println(s3.substring(3));
		System.out.println(s2.substring(4, 6));
		System.out.println(s2.endsWith("ty"));
		System.out.println(s1.startsWith("ve"));
		System.out.println(s2.lastIndexOf("E"));
		System.out.println(s2.indexOf("T"));
		System.out.println(s2.contains(s3));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s2.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		
		
		
	}

}
