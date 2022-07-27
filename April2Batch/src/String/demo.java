package String;

public class demo {
	
	public static void main(String[] args) {
		
		String s1 = "ABCD";
		String s2 = "VELOCITY";
		String s3 = "CITY";
		
		
		System.out.println(s2.replace("Y", "J"));
		System.out.println(s2.isEmpty()); // method checks if the input string is empty or not length 0 then true
		System.out.println(s2.concat(s3));// join the string at the end of current string
		System.out.println(s2.substring(4));// it will remove 1st 4 index and then give remaining
		System.out.println(s2.substring(4, 7));//it will remove 1st 4 and 7th index and then give remaining
		System.out.println(s1.endsWith("ty"));//checks if this string ends with a given suffix. It returns true 
		System.out.println(s1.startsWith("ve"));////checks if this string starts with a given suffix. It returns true 
		System.out.println(s1.lastIndexOf("t")); // will print index number where last t located
		System.out.println(s1.indexOf("t"));// print only index
		System.out.println(s1.charAt(0)); // character at 0 index will print
		System.out.println(s1.contains(s3));// check contains of old string in new string true or false
		System.out.println(s1.equals(s2)); // check string is equal or not true or false
		System.out.println(s2.equalsIgnoreCase(s1)); //check with ignoring upper case and lower case true
		System.out.println(s1.length());
		s1 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		//System.out.println(s1.inde);
		System.out.println("-----------------------------------");
		
		//String [] result = s1.split(" ");
		//for (int i = 0;i< result.length;i++) {
			//System.out.println(result[i]);
			
			String a = String.join(s1, s3,s2);
			System.out.println(a);
			
			
		}
		
		
		
		
		
		
	}
	
	

