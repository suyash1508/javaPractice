package javaquestions2;

public class ReversetheString {

	public static void main(String[] args) {
		
		
		String s = "java";
	
		String s1= "";
		for(int i=s.length()-4; i<=3; i++) {
			
			s1 = s1+ s.charAt(i);
			
			System.out.println(s1);
			
		}
	}

}
