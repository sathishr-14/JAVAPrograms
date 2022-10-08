package JavaBasics;
import java.util.Arrays;

public class ArrayRotation {
	
	public static void leftRotate(int n[],int no) {
		System.out.println("Array before rotation");
		System.out.println(Arrays.toString(n));
		
		int first;
		for(int i=0; i<no; i++) {
			first = n[0];
			for(int j=0;j<n.length-1;j++) {
				n[j]=n[j+1];
			}
			n[n.length-1] = first;
		}
		System.out.println("Array after rotation by : "+no+" position");
		System.out.println(Arrays.toString(n));
	}
	
	public static void rightRotate(int n[],int no) {
		System.out.println("Array before rotation");
		System.out.println(Arrays.toString(n));
		
		int last;
		for(int i=0; i<no; i++) {
			last = n[n.length-1];
			for(int j=n.length-1; j>0;j--) {
				n[j]=n[j-1];
			}
			n[0] = last;
		}
		System.out.println("Array after rotation by : "+no+" position");
		System.out.println(Arrays.toString(n));
	}

	public static void main(String[] args) {
		
		int n[] = {1,2,3,4,5};
//		leftRotate(n, 2);
		rightRotate(n, 1);

	}

}
