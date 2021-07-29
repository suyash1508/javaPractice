package javaquestions1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Calenderdemo {

	public  static  void main(int[] A) {
		
		
//		Calendar cal= Calendar.getInstance();
//		SimpleDateFormat time= new SimpleDateFormat("M/d/yyyy hh:mm:ss");
//		System.out.println(time.format(cal.getTime()));
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//		System.out.println(cal.get(Calendar.DECEMBER));
		
		int B[] = {1, 3, 6, 4, 1, 2};
		int N = B.length;
		Set<Integer> set = new HashSet<>();
		for (int a : B) {
		    if (a > 0) {
		        set.add(a);
		    }
		}
		for (int i = 1; i <= N + 1; i++) {
		    if (!set.contains(i)) {
		        System.out.println(i);
		    }
		}
	
	

	}

}
