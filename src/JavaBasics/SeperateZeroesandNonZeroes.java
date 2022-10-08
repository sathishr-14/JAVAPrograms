package JavaBasics;
import java.util.Arrays;
public class SeperateZeroesandNonZeroes {

	public static void main(String[] args) {
		
		int arr[] = {1,2,0,4,5,0,0,0,3,0};
		ShiftZeroestoRight(arr);
		ShiftZeroestoleft(arr);
	}

	public static void ShiftZeroestoRight(int a[]) {
		int count = 0;
		int b[] = new int[a.length];
		for(int e : a) {
			if(e!=0) {
				b[count] = e;
				count++;
			}
		}
		System.out.println(Arrays.toString(b));
	}
	
	public static void ShiftZeroestoleft(int a[]) {
		int count = a.length-1;
		int b[] = new int[a.length];
		for(int e : a) {
			if(e!=0) {
				b[count] = e;
				count--;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
