package JavaBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsername {
	
	public static boolean username(String str) {
		
		String regex = "(^[a-zA-Z][0-9_|a-zA-Z]{7,29})";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(str);
		return m.matches();
	}

	public static void main(String[] args) {

		System.out.println(username("Sathish"));
		System.out.println(username("Sathish_234"));

	}

}
