package JavaBasics;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {

		int[] elements = {1,3,4,5,2,-1};
//		Arrays.sort(elements);
//		int smallest = Integer.MAX_VALUE;
//		int secondSmallest = Integer.MAX_VALUE;
		int smallest = elements[0];
		int secondSmallest = elements[0];
		for (int i = 0; i < elements.length; i++) {
		    if (elements[i] < smallest) {
		        secondSmallest = smallest;
		        smallest = elements[i];
		    } else if (elements[i] < secondSmallest) {
		        secondSmallest = elements[i];
		    }
		}
		System.out.println("Second smallest is : "+secondSmallest);
		System.out.println("smallest is : "+smallest);
//		System.out.println(elements[1]);
	}

}
