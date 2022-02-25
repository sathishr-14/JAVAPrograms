package JavaBasics;

import java.util.Arrays;

public class Anagram {

	public static void isAnagram(String s1, String s2) {
		String str1 = s1.replaceAll("\\s", "");
		String str2 = s1.replaceAll("\\s", "");

		boolean status = true;
		if (str1.length() != str2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = str1.toLowerCase().toCharArray();
			char[] ArrayS2 = str2.toLowerCase().toCharArray();

			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status = Arrays.equals(ArrayS1, ArrayS2);
		}

		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}

	public static void main(String[] args) {
		isAnagram("keep", "peek");
		isAnagram("Dogs", "gods");
		isAnagram("Mom", "WOW");
		isAnagram("Mother In Law", "Hitler Woman");
	}

}
