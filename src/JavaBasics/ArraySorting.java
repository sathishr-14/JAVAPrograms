package JavaBasics;
import java.util.Arrays;
public class ArraySorting {

	public static void main(String[] args) {

		int a[] = {10,22,9,-1,-4,100};
		int temp;
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("2nd smallest : "+a[1]);
		System.out.println("Array after sorting in ascending order : ");
//		for(int e : a) {
//			System.out.print(e);
//		}
		System.out.println(Arrays.toString(a));
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("2nd highest : "+a[1]);
		System.out.println("Array after sorting in descending order : ");
//		for(int e : a) {
//			System.out.print(e);
//		}
		System.out.println(Arrays.toString(a));

	}

}
