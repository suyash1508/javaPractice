package javaquestions2;

import abstraction.HDFCbank;

public class Stringswapping {
	
	public static void main(String[] args) {
		
		String str1 = "Suyash";
		String str2 = "Tripathi";
		
	    str1 = str1 +str2;  //SuyashTripathi
	   
	System.out.println(str2= 	str1.substring(0, str1.length()-str2.length() ));
	System.out.println(str1= str1.substring(str2.length()));
	System.out.println("**************");
	   String str3;
	   
	   str3= str1;  //str3 = suyash
	   str1 = str2; // str1 = tripathi
	   str2=str3; //   suyash 
	  
	  System.out.println(str1); 
	  System.out.println(str2);

		
	
	  
	  
	  
	 
	   
	   
		
	
	
	}

}
