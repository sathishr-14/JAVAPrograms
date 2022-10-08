package JavaBasics;
import java.util.Arrays;
public class SegregateZeroOneTwo {

	public static void main(String[] args) {
		
		int a[] = {1,0,1,2,0,2,2,0,0,1};
		
		int zeroes = 0;
		int ones = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				zeroes++;
			}
			if(a[i]==1) {
				ones++;
			}
		}
		
		for(int i=0; i <zeroes; i++) {
			a[i] = 0;
		}
		
		for(int i=zeroes; i<(zeroes+ones); i++) {
			a[i] = 1;
		}
		
		for(int i=(zeroes+ones); i<a.length; i++) {
			a[i] = 2;
		}

//		for(int i=0; i <a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
		System.out.println(Arrays.toString(a));
	}

}
