package javaquestions1;

import java.util.Scanner;

public class POsitiveOrNegativeNumber {

	public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");
		double a = sc.nextDouble();
		if(a>0.0) {
			System.out.println("Postive number");
		}else if(a<0.0) {
			System.out.println("Negative number");
		}

		else {
			System.out.println("Zero");

		}

	}
}