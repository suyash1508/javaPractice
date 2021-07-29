package javaquestions1;

public class NaturalNumberSum {

	public static void main(String[] args) {

    int num = 5;
    int sum = 0;
    int sum1 = 0;
    
    for(int i=0;  i<=num; i++) {
    	
    	sum = sum + i;
    	
    	
    }
		
    System.out.println("sum is " + sum  );
     System.out.println("'--------");
     
     int k = 1;
     while(k <= num) {
    	 sum1 = sum1+k;
    	k++;
    	
     }
     
     System.out.println("sum is "+ sum1);
	 
    

	}

}
