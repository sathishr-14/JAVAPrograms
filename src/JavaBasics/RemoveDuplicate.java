package JavaBasics;

import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s = "Java has ooops concepts";
		removeDuplicate(s);

	}
	
	public static void removeDuplicate(String s) {
		String a[] = s.split("\\s");
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(String e : a) {
			for(int i=0;i<e.length();i++) {
				set.add(e.charAt(i));
			}
		}

		for(Character ch : set) {
			System.out.print(ch);
		}
	}

}
