package javaquestions1;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   System.out.println("enter a number");
   int a = sc.nextInt();
   if(a % 2==0)  {
	   System.out.println("Even number");
   }
   else {
	   
	   System.out.println("Odd number");
   }
	}
}
