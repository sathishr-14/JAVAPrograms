package JavaBasics;
import java.util.Arrays;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int product [] = new int[a.length];
		int p = 1;
		
		for(int i=0; i<a.length; i++) {
			p= p*a[i];
		}
		for(int i=0; i<a.length; i++) {
			product[i] = p/a[i];
		}
		System.out.println(Arrays.toString(product));
		
		int b[] = {1,2,3,4,5};
		int prod [] = new int[b.length];
		int left[] = new int[b.length];
		int right[] = new int[b.length];
		
		left[0] = 1;
		right[b.length-1] = 1;
		
		for(int i=1; i<b.length; i++) {
			left[i] = b[i-1] * left[i-1];
		}
		for(int i=b.length-2; i>=0; i--) {
			right[i] = b[i+1] * right[i+1];
		}
		
		for(int i=0; i<b.length; i++) {
			prod[i] = left[i] * right[i];
		}
		
		System.out.println(Arrays.toString(prod));
	}

}
