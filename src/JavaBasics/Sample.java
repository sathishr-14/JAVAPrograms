package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;

public class Sample {

	public static void main(String[] args) {
		
		ArrayList<Integer> n = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11));
		int count =0;
		for(int i=0; i<n.size(); i++) {
			if(n.size()>2) {
				ArrayList<Integer> list1 = new ArrayList<Integer>();
				list1.add(i);
				
				System.out.print(list1);
			}
		}
		

	}

}
