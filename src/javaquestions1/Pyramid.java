package javaquestions1;

public class Pyramid {

	public static void main(String[] args) {
		
	/*	1
		2 3 
		4 5 6
		7 8 9 10 */
		int k = 1;
		for(int i=1; i<5; i++) {
			
	//		System.out.println("loop 1");
			 
			for(int j =1; j<=i; j++) {
				
				System.out.print(k);
				
	//			System.out.println("loop 2");
				System.out.print("\t");
				k++;
			}
			
		 System.out.println("");
		}
		

	}

}
