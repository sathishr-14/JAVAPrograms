package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateUsingHash {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,1,2};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int e : a) {
			if(map.containsKey(e)) {
				map.put(e, map.get(e)+1);
//				map.put(e, 1);
			}
			else {
//				map.put(e, map.get(e)+1);
				map.put(e, 1);
			}
		}
		
		for(Integer e : map.keySet()) {
			if(map.get(e)>1) {
				System.out.println("Duplicate element is : "+e);
			}
		}
	}

}
