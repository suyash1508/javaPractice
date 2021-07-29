package javaquestions1;

import java.util.ArrayList;
import java.util.List;

public class FiboniceeSeries {

	public static void main(String[] args) {

		// 0 1 1 2, 3 5 8 13 21....
		// 0+1 = 1 ,  1+1 = 2...

//		int num = 10;
//		int t1 = 0;
//		int t2 = 1;
//		for(int i=1;  i<num;  i++){
//			System.out.println(t1);
//			int sum = t1 + t2;
//			t1 = t2;
//			t2 = sum; 

		// 1,2,6,9,4,0
		
		ArrayList list = new ArrayList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(4);
	    list.add(6);
		list.add(9);
		System.out.println("size >>>" + " " + list.size());
	//	for(Integer a:list) {
			
		//	System.out.println(a);
			for(int i =0; i<list.size(); i++) {
				
				System.out.println(list.get(i));
				
			}
		}
		

	}


