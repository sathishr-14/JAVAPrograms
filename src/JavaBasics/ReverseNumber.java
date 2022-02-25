package JavaBasics;

public class ReverseNumber {
	
//	public static void rev(int num) {
//		if(num<10) {
//			System.out.println(num);
//		} else {
//			System.out.print(num%10);
//			rev(num/10);
//		}
//	}

	public static void main(String[] args) {
//		rev(12345);
		
		int num = 12345;
		int rev = 0;
		
		while(num!=0) {  //checks if the number is >0
			rev = rev*10+num%10;  // multiply rev by 10 and add remainder of num by using modulus operator
			num = num/10;  //  multiply by 10 to remove the last digit
		
			/*
			 * 12345
			 * rev = 0*10+12345%10 (5)
			 * num = num/10  12345/10 = 1234
			 * 1234 goes back to while condition and check if its > 0 and repeats the process.
			 * 
			 */
		}
		System.out.println(rev);
		
		// using string buffer
		
		int num1 = 12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		

	}

}
