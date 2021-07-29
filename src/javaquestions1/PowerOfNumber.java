package javaquestions1;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		
		int  num  = 3;
		int power = 4;
		
		long result = 1;
//		 while(power != 0) {
//		  result = result*num;
//		  power--;
//		  
//		 }
//		 System.out.println(result);
//	//	 System.out.println(Math.pow(num, power));
		
		for(num=1; num<=power; power-- ) {
			result= num*power;
		}
		System.out.println(result);
	}
	
}
	


