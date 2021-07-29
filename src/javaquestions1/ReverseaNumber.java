package javaquestions1;

public class ReverseaNumber {

	public static void main(String[] args) {
		
/*		int num =1234;
		int rev = 0;
		
		while(num != 0) {
			int r = num % 10;  // 4
			rev = rev *  10 + r;  // 0*10 + 4
			num = num/10;// 123/10 
			
			
		}
		 System.out.println("Reverse number is: " +  rev);*/
		
		// Reverse the string
		
		String s = "madam";
		 String r = ""; 
		for(int i =s.length()-1; i>=0; i--) {
			
		  r = r + s.charAt(i);
			 
		}
		
		System.out.println(r);
		 if (s==r) 
			System.out.println("Pallindrom"); 
		 
		 else 
			 
			 System.out.println("Not a pallindrom");
		 
	}

}
