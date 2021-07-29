package javaquestions1;

public class PallindromNumber {

	public static void main(String[] args) {
		
		
		
		int n = 0;
		int rev = 0;
		 int actualNum = n;
		
		while(n !=0){
			 int r = n % 10; //1 //2
			  rev = rev*10 + r; // 1 // 10+2=12
			  n = n/10;
			 
			
			
		}
      //   System.out.println(rev);
          if(actualNum ==rev) {
        	  
        	  System.out.println(actualNum + " is pallindrom number");
          }else {
        	  System.out.println(actualNum + " is not pallindrom number");
          }
	}
    
}
