package javaquestions2;

public class Reversenumber {

	public static void main(String[] args) {
		
		int num = 1234;
		
		int rev = 0;
		
//		while(num!=0) {
//			
//		rev = rev *10 + num %10;
//		num = num /10;
//		}System.out.println(rev);
		
		for(int i=0; i<num; i++) {
			rev = rev *10 + num %10; //432  40+3  430+2
			num = num /10; // 12 1
			
		}System.out.println(rev);
		

	}

}
