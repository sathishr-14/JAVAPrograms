package JavaBasics;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		String rev = "";
		int len = str.length();
		
		for(int i=len-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}

		System.out.println(rev);
		
		if(str.equals(rev)) {
			System.out.println(str +" is palindrome");
		}
		else {
			System.out.println(str +" is not palindrome");
		}
		
		System.out.println("--------------------");

		int n =1211;
		int r = 0;
		int org_num = n;
		
		while(n!=0) {
			r = r*10+n%10;
			n = n/10;
		}
		
		System.out.println(r);
		
		if(org_num==r) {
			System.out.println(r + " Number is palindrome");
		}
		else {
			System.out.println(r+" Number is not palindrome");
		}
	}

}
