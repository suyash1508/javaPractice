package javaquestions2;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

//		String names[]= {"Java", "Javascript", "C", "C++", "Python", "Java"};
//
//		for(int i =0; i<names.length; i++) {
//
//			for(int j =i+1; j<names.length; j++) {
//
//				if(names[i].equals(names[j])) {
//
//					System.out.println(names[i]);
//				}
//
//			}
//
//
//		}

		int numbers[]= {1,2,3,5,6,6};
		int N= numbers.length;
		Set<Integer> st = new HashSet<>();

		for(Integer number : numbers) {

			if(st.add(number)== false) {

				//			System.out.println(number);

				for(int i=1; i<=N; i++) {

                    if(!st.contains(i)) {
                    System.out.println(i);
                    }

				}

			}

		}
		



	}

}
