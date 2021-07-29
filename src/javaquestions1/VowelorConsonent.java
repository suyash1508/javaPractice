package javaquestions1;

import java.util.Scanner;

public class VowelorConsonent {

	public static void main(String[] args) {
		
		char ch = 'p';
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("ch is "+"Vowel charchater");
		}
		else {
			System.out.println("ch is "+"Constant");
			
		}
		
		switch(ch) {
		case  'a':
		case  'e':
		case  'i':
		case  'o':
		case  'u':
			System.out.println("ch is "+"Vowel");
			break;
			 default:
				 System.out.println("ch is"+"Constant");
			 
		
		

	
		
		
		
		}
		
	}
}
