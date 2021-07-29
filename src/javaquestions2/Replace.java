package javaquestions2;

public class Replace {

	public static void main(String[] args) {
		
	//	int A12B3C4D23E = 0;
		String  s = "A12B3C4D23E";
		
		s = s.replaceAll("[^0-9]", "");
//		System.out.println(s);
		//123423
       int num = Integer.parseInt(s);
   //    System.out.println(num);
       int sum = 0;
       int rem = 0;
    //   for(int i =s[0]; i<=s.length(); i++)
       
       while (num>0) {
    	   
    	   rem = num % 10;
    	   sum = sum +rem;
    	   num = num /10;
       }
       
       System.out.println(sum);
       
	}

}
