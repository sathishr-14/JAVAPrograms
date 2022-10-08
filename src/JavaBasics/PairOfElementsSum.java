package JavaBasics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairOfElementsSum {
	
	static void SumofElements(int n[], int inputNumber) {
		Arrays.sort(n);
		System.out.println("Sum of pair of elements : "+inputNumber);
		int i =0;
		int j = n.length-1;
		
		while(i<j) {
			if(n[i]+n[j] == inputNumber) {
				System.out.println(n[i]+"+"+n[j]+" = "+inputNumber);
				i++;
				j--;
			}
			else if(n[i]+n[j] < inputNumber) {
				i++;
			}
			else if(n[i]+n[j] > inputNumber) {
				j--;
			}
		}
	}

	public static void main(String[] args) {
		SumofElements(new int[] {4,6,5,-10,8,5,4,2,20}, 8);
		SumofElements(new int[] {4,6,5,-10,8,5,20,2}, 8);
		int array [] = new int[] {1,2,4,3,5};
		TwoSum(array, 6);
	}
	
	public static void TwoSum(int a[] , int target) {
		System.out.println("Pair of elements for the sum : "+target);
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				int compliment = target - a[i];;
				if(a[j] == compliment) {
					System.out.println("Pair is : "+a[i]+","+a[j]);
				}
			}
		}
	}

}
