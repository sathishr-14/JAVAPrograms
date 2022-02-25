package JavaBasics;

public class ReverseTheWords {

	public static void main(String[] args) {
		String str = "Java Python Ruby";
		String reversed = "";
		String s []=str.split(" ");
		
		for(int i=s.length-1;i>=0;i--) {
			reversed = reversed+s[i]+" ";
		}
		System.out.println(reversed);

	}

}
