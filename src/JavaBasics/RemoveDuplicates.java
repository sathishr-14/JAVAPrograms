package JavaBasics;

import java.util.LinkedHashSet;
import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
//		String sentence = "London london bridge is falling down down";
		String sentence = "Java has ooops concepts";
		String result = "";
//		String s = sentence.toLowerCase();
		String [] a = sentence.split("\\s");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.asList(a));
		for(String e : set) {
			result = result+e+" ";
		}
		
//		for(int i=0;i<a.length;i++) {
//			for(int k=i+1; k<a.length; k++) {
//				if(a[i]==a[k]) {
//					a[i]=result;
//				}
//			}
//		}
//		for(String e : a) {
//			if(e!="remove") {
//				result = result+e+" ";
//			}
//		}
		System.out.println(result);

	}

}
