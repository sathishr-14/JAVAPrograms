package JavaBasics;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class UniqueCharacter {

	public static void main(String[] args) {
		
		String s = "SpidermanS";
//		char y[] = s.toCharArray();
//		int size = y.length;
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		char strArray[] = s.toCharArray();
		
		for(char c : strArray) {
			if(!String.valueOf(c).isBlank()){
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
			}
		}
		
		Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
		for(Map.Entry<Character, Integer> data : hmap) {
			if(data.getValue()>1) {
				System.out.println("Doesn't contains unique characters");
				System.exit(0);
			}
			System.out.println("Contains unique characters");
			System.exit(0);
		}

	}

}
