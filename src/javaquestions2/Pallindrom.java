package javaquestions2;

import java.util.Scanner;

public class Pallindrom {
	
	
	//151
	 public static void main(int num) {
		 
	System.out.println(151);
			
				 }
	 
	 public static void isPallindrom(){
//	 Scanner sc = new Scanner(System.in);
//	 System.out.println("Please enter number");
//		int num = sc.nextInt();
	 
	 int num = 0;
	
		
	    int rem = 0;
		int sum = 0;
		
		while(num>0) {
			
			rem = num %10;
			sum = (sum*10)+ rem;
			num = num /10;
			
		}System.out.println(rem);
		 
	 }	
}
	
     


