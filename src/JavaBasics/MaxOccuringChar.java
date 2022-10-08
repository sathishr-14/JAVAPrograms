package JavaBasics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccuringChar {

	public static void main(String[] args) {
		
		String s = "Java is a programming language";
		char y[] = s.toCharArray();
		int size = y.length;
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int i=0;
		while(i!=size) {
			if(!map.containsKey(y[i])) {
				map.put(y[i], 1);
			}
			else {
				map.put(y[i], map.get(y[i])+1);
			}
			i++;
		}
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		char max_key = ' ';
		int max_value = 0;
		for(Map.Entry<Character, Integer> data : hmap) {
			if(data.getValue() > max_value) {
				max_value = data.getValue();
				max_key = data.getKey();
			}
		}
		System.out.println(max_key +" : "+max_value);
//		System.out.println(max_value);
//		for(Map.Entry<Character, Integer> data : hmap) {
//			if(data.getValue() > 1) {
//				System.out.print("Doesn't contain unique characters");
//				System.exit(0);
//			}
//			else {
//				System.out.println("Contains unique characters");
//				System.exit(0);
//			}
//		}

	}

}
