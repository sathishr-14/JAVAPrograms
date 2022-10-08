package JavaBasics;

public class UpperCaseLetters {

	public static void main(String[] args) {
		
		String str = "Find UpperCase Letters";
		for(int i=0; i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
		String t1 ="Sathish";
		String t2 = " sathish ";
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1.equalsIgnoreCase(t2.trim()));
	}

}
