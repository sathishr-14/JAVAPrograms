package JavaBasics;

public class EvenLengthString {

	public static void main(String[] args) {
		
		String s = "Hello java ruby python php";
		String s1[] = s.split(" ");
		for(int i=0; i <s1.length; i++) {
			if(s1[i].length()%2==0) {
				System.out.println(s1[i]);
			}
		}

	}

}
