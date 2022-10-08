package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateElements {
	
	public static void UsingHash(int a[]) {
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], a[i]+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		map.forEach((k,v) -> System.out.print(k+" "));
	}

	public static void main(String[] args) {
		
		int a[] = {1,2,2,3,4,5,5,6,7,8,9,9};
		UsingHash(a);
		System.out.println();

		int n[] = {1,2,2,3,4,5,5,6,7,8,8,9};
		int len = n.length;
		int temp [] = new int[n.length];
		int j=0;
		
		for(int i=0; i<len-1;i++) {
			if(n[i]!=n[i+1]) {
				temp[j++] = n[i];
			}
		}
		temp[j++] = n[len-1];
		for(int k=0; k<j; k++) {
			System.out.print(temp[k]+" ");
		}
	}

}
