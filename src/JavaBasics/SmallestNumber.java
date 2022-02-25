package JavaBasics;

public class SmallestNumber {

	public static void main(String[] args) {

		int elements [] = {1,2,-1,-4,5};
		int smallest = elements[0];  //initialize the first element to compare the remaining element to find smallest
		for(int i=0; i<elements.length; i++) {  // iterate through all elements
			if(elements[i] < smallest) {  // if the iterated element is less than smallest which the first element in array
				smallest = elements[i];  // then assign that number to smallest
			}
		}
		System.out.println(smallest);

	}

}
