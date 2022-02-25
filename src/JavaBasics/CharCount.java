package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

	public static void getCharCount(String name) {
		Map<Character,Integer> charmap = new HashMap<Character,Integer>();
		char strArray[] = name.toCharArray();
		
		for(char c : strArray) {
			if(!String.valueOf(c).isBlank()){
			if(charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c)+1);
			}
			else {
				charmap.put(c, 1);
			}
			}
		}
		
		System.out.println(name +":"+charmap);
	}

	public static void main(String[] args) {
		getCharCount("Sathish Kumar");
	}

}
