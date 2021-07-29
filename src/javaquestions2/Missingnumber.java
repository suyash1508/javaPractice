package javaquestions2;

public class Missingnumber {

	public static void main(String[] args) {
		
		
		
		int n[] = {1,2,3,4,5,6,8};
		int sum = 0;
		int sum1 = 0;
		
		for(int i = 0; i<n.length; i ++) {
			
			sum = sum + n[i];
			
		}System.out.println(sum);

		
		for(int j = 0; j<9; j++) {
			 
			sum1=sum1+j;
			 
			
		}System.out.println(sum1);
			
		System.out.println(sum1-sum);
	}
}
