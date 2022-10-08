package JavaBasics;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class SwapElementsinArray {

	public static void main(String[] args) {
		
		Integer n [] = {11,22,66,44,55};
		List<Integer> al = Arrays.asList(n);
		Collections.swap(al, 0, 2);
		System.out.println(al);

	}

}
