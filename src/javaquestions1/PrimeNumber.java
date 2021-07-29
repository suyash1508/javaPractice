package javaquestions1;

public class PrimeNumber {

	public static void main(String[] args) {


		int num = 1;
          int count = 0;
         
		//boolean flag = false;

//		for(int i=2; i<num; i++) {
//
//			if (num % i == 0)	{
//				flag = true;
//				break;
		 int i = 1;
		while(i<=num) {
		 if(num % i == 0) {
				  count++;
				   i++;
			
		}
		 if(count == 2) {
				System.out.println(num + " is a prime number");
		}
		
		else{
			System.out.println(num + " is a not prime number");
		
		}
	}
	}
}
