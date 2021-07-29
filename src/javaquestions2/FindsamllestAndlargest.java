package javaquestions2;

public class FindsamllestAndlargest {



	public static void main(String[] args) {


		int N[] = {-10,20,58,65889};

		int largestnumber = N[0];
		int smallestnumber = N[0];
		//	int l = N.length;

		for(int i=1; i<N.length; i++) {
			
			if(N[i]>largestnumber) {
				
				largestnumber = N[i];
				
			}else if(N[i]<smallestnumber){
				
				smallestnumber= N[i];
				
			}
			
		}	System.out.println(largestnumber);
		System.out.println(smallestnumber);

	}






}
