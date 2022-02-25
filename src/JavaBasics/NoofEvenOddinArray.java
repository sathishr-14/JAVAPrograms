package JavaBasics;

public class NoofEvenOddinArray {

	public static void main(String[] args) {
		
		
		int a [] = {1,2,3,4,5,6,7};
		
//		int even = 0;
//		int odd  = 0;
//		System.out.println("Even numbers : ");
//		for(Integer e : a) {
//			if(e%2==0) {
//				System.out.println(e);
//				even++;
//			} 
//		}
//		System.out.println("Number of even numbers : "+even);
//		
//		System.out.println("Odd numbers : ");
//		for(Integer e : a) {
//			if(e%2!=0) {
//				System.out.println(e);
//				odd++;
//			} 
//		}
//		System.out.println("Number of odd numbers : "+odd);
		
		
		int even = 0;
		int odd = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				even++;
			} else {
				odd++;
			}
		}
		
		System.out.println("Number of even numbers : "+even);
		System.out.println("Number of odd numbers : "+odd);

	}

}
