package javaquestions2;

public class Strings {
	
	public static void main(String[] args) {
		
		String str = "jy name is mac magic mom";
	//	 System.out.println(str.indexOf("m"));
	   System.out.println(str.indexOf(('m'), str.indexOf('m')+1));
		
//		String str = "The rains have started here selenium";
//		System.out.println(str.indexOf(('s'), str.indexOf('s') + str.indexOf('s')+1));//3rd occurrence of 's'
	   
	   Boolean b1= new Boolean("Hi");

	   Boolean b2=new Boolean("Hello");

	   System.out.println(b1==b2);

	   System.out.println(b1.equals(b2));
	   
		String str2 = "hi";
		String str3 = "hello";
		 System.out.println(str2.equals(str3));
	}
	

}
