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
	}

}
