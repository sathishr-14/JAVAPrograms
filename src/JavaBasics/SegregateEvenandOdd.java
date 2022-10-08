package JavaBasics;
import java.util.Arrays;

public class SegregateEvenandOdd {

	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6,7,1,10};
		
		int first = 0;
		int last = a.length-1;
		int temp;
		
		for(int i=0; i<a.length; i++) {
			if(a[first]%2==0) {
				first++;
			}
			if(a[last]%2==1) {
				last--;
			}
			if(first < last) {
				temp = a[first];
				a[first] = a[last];
				a[last] = temp;
			}
		}
		System.out.print(Arrays.toString(a));

	}

}
