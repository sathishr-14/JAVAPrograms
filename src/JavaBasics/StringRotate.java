package JavaBasics;
import java.util.Arrays;

public class StringRotate {

	public static void main(String[] args) {
		
		String s = "amazon";
		char charr[] = s.toCharArray();
		char first;
		for(int i=0; i<2; i++) {
			first = charr[0];
			for(int j=0; j<charr.length-1; j++) {
				charr[j] = charr[j+1];
			}
			charr[charr.length-1] = first;
		}
		System.out.println(Arrays.toString(charr));
		
		
		System.out.println(s.substring(2, s.length())+s.substring(0, 2));
	}

}
