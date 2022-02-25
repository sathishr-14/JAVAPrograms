package JavaBasics;

public class DuplicateElements {

	public static void main(String[] args) {
		
		int n[] = {1,2,3,3,4,5,2};
		
		for(int i=0; i<n.length; i++) {
			for(int j=i+1; j<n.length; j++) {
				if(n[i]==n[j]) {
					System.out.println(n[i]);
				}
			}
		}
		
		String s []= {"Java","Python","Ruby","Java","Ruby"};
		for(int i=0; i<s.length; i++) {
			for(int j=i+1; j<s.length; j++) {
				if(s[i].equals(s[j])) {
					System.out.println(s[i]);
				}
			}
		}

	}

}
