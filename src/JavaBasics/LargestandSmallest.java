package JavaBasics;

public class LargestandSmallest {

	public static void main(String[] args) {

		int n[] = { 10, 12, 20, 8, -2 };
		int largest = n[0];  // store the first number in 0th index to start comparing the next numbers
		int smallest = n[0];  // store the first number in 0th index to start comparing the next numbers

		for (int i = 1; i < n.length; i++) {
			if (n[i] > largest) {
				largest = n[i];  // if the n[i] is greater than the largest then store it inside the largest
			} else if (n[i] < smallest) {
				smallest = n[i];  // if the n[i] is lesser than the smallest then store it inside the smallest
			}
		}
		System.out.println("Largest number is : " + largest);
		System.out.println("Smallest number is : " + smallest);
		
		int a[] = {10,20,30,9,8,1000};
		int firstlargest = a[0];
		int secondlargest = a[1];
//		if(a[0] > a[1]) {
//			firstlargest = a[0];
//			secondlargest = a[1];
//		}
//		else {
//			firstlargest = a[1];
//			secondlargest = a[0];
//		}
		for(int i=1; i<a.length;i++) {
			if(a[i] > firstlargest) {
				secondlargest = firstlargest;
				firstlargest = a[i];
			}
			else if(a[i]< firstlargest && a[i] > secondlargest) {
				secondlargest = a[i];
			}
		}
		System.out.println("First largest is : "+firstlargest);
		System.out.println("Second largest is : "+secondlargest);
	}

}
