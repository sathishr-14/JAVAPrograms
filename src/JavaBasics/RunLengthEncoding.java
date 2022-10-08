package JavaBasics;

public class RunLengthEncoding {

	public static void main(String[] args) {
		
		String str = "aaaabaaaccccdddbb";
		int len = str.length();
		for(int i=0; i<len; i++) {
			int count = 1;
			while(i<len-1 && str.charAt(i) == str.charAt(i+1)) {
				count++;
				i++;
			}
			System.out.print(str.charAt(i)+""+count);
		}
	}
}
