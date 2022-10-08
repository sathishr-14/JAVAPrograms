package JavaBasics;

public class StringRotation {

	public static void main(String[] args) {
		
		String s1 = "XYZ";
		String s2 = "ZYX";
		
		String rev = "";
		if(s1.length()!=s2.length()) {
			System.out.println("False");
		}
		else {
			for(int i=s1.length()-1; i>=0;i--) {
				rev = rev+s1.charAt(i);
			}
			System.out.println(rev);
			if(rev.equals(s2)) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		}

	}

}
