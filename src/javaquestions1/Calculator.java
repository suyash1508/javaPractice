package javaquestions1;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		double firstnum = sc.nextDouble();
		System.out.println("Enter opeartor" + "+ , - , * , /");
		char operator = sc.next().charAt(0);
		
		System.out.println("Enter second number");
		double secondnum = sc.nextDouble();
		 double result = 0;
		 
		 switch(operator){
		 case '+':
			  result = firstnum + secondnum;
			  break;
		 case '-':
			  result = firstnum - secondnum;
			  break;
		 case '*':
			  result = firstnum * secondnum;
			  break;
		 case '/':
			  result = firstnum / secondnum;
			  break;   
			  default:
				  System.out.println("Please enter valid operator");
		 
		 
		 }
		  System.out.println(result);
		 
	}
     
}
