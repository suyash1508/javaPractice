package javaquestions1;

public class Starpattern2 {

	public static void main(String[] args) {
//	        *        04
//	      * *   13 , 14
//	    * * *
//    *	* * *
//  * * * * *	
//	
		for(int i=0; i<=4; i++) { // row
			for(int j=4; j>=i; j--) { // coloumn
				
				System.out.print("");
			for(int k =0; k<=i; k++) {
				System.out.print("*");	
			}System.out.println("");
			
			}
		}//System.out.println("");

	}

}
