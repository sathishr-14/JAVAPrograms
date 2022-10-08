package JavaBasics;
import java.util.Arrays;

public class SegregateZeroandOne {

	public static void main(String[] args) {
		
		int a[] = {1,1,1,1,0,0,0,0};
		int count = 0;
		
//		for(int i=0; i<a.length; i++) {
//			if(a[i]==0) {
//				a[count++]=a[i];
//			}
//		}
//		while(count < a.length) {
//			a[count++] = 1;
//		}
//		
//		for(int k=0; k<a.length; k++) {
//			System.out.print(a[k]+" ");
//		}
//		System.out.println();
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				count++;
			}
		}
		
		for(int i=0; i<count; i++) {
			a[i]=0;
		}
		
		for(int i=count; i<a.length; i++) {
			a[i]=1;
		}
		
		System.out.println(Arrays.toString(a));
	}

}
