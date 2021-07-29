package javaquestions1;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	  
		int a =10;
		int b= 20;
		 System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		 
//		 System.out.println("after swapping");
//		
//		int  temp;
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println(a);
//		System.out.println(b);
//		 
//		
		// w/o temp varibale
		
		 System.out.println("after swapping");
		 a = a-b;  //10-20 = -10
		 b= a+b; // -10+20 = 10
		 a= b-a; // 10+10= 20
		 System.out.println(a);
		 System.out.println(b);
		 
			 
		

	}

}
