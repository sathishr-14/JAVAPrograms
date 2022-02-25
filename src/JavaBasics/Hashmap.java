package JavaBasics;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String,Integer> studentmap = new HashMap<String,Integer>();
		studentmap.put("Sathish", 25);
		studentmap.put("Kumar", 20);
		studentmap.put("Kumars", 22);
		studentmap.put("Tom", 10);
		studentmap.put("Brad", 30);
		
		studentmap.forEach((k,v) -> System.out.println(k+" : "+v));

	}

}
