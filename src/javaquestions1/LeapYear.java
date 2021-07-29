package javaquestions1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter year");

		int a = sc.nextInt();
		boolean leap = false;
		if(a % 4 == 0) {
			if(a % 100== 0) {
				if(a % 400== 0) {
					leap = true;
				} else {
					leap = false;
				}
			}  else {
				leap = true;
			}
		}

		else {
			leap = false;


		}		

		if (leap) {
   System.out.println("Leap Year");
		}	else {
			System.out.println("Not a Leap Year");
		}
	}
}