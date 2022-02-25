package JavaBasics;

public class SubString {
	
	public static boolean isSubstring(String main, String sub) {
		return main.matches("(.*)"+sub+"(.*)");
	}

	public static void main(String[] args) {
		System.out.println(isSubstring("Sathish kumar", "kumar"));
		
		String s = "Sathish";
		System.out.println(s.substring(3));

	}

}
