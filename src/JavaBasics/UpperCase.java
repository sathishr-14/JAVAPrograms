package JavaBasics;

public class UpperCase {

	public static void main(String[] args) {
		
		String s = "java python ruby";
		String s1[] = s.split(" ");
		for(String e : s1) {
			String firstChar = e.substring(0,1);
			String remainingChar = e.substring(1);
			String uppercase = firstChar.toUpperCase()+remainingChar;
			System.out.println(uppercase);
		}
		
		System.out.println();
		
		for(String e : s1) {
			System.out.println(e.toUpperCase());
		}

	}

}
