package JavaBasics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayMultipleBy2 {

	public static void main(String[] args) {
		
		int a[] = {2,3,4,5,6,7,8,9,10};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<a.length; i++) {
			map.put(a[i], a[i]*2);
		}
		Set<Map.Entry<Integer, Integer>> hmap = map.entrySet();
		for(Map.Entry<Integer, Integer> data : hmap) {
			System.out.print("["+data.getKey()+","+data.getValue()+"]");
		}
		
	}

}
