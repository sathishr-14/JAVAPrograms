package JavaBasics;

public class PrimeNumber {

	public static boolean isprimenumber(int num) {
		if(num<=1) {
			System.out.println("Not prime number");
			return false;	
		}
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				System.out.println("Not prime number");
				return false;
			}
		}
		System.out.println("prime number");
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isprimenumber(33));
	}

}
