package JavaBasics;

public class StringReverse {

	public static void main(String[] args) {
		
		String s = "My name is Sathish kumar";
		
		String rev = "";
		int len = s.length();
		
		for(int i=len-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}

		System.out.println(rev);
		
		StringBuilder sb = new StringBuilder("Sathish");
		System.out.println(sb.reverse());
	}

}
