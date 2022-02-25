package JavaBasics;

public class WordReverse {

	public static void main(String[] args) {
		 String s = "My name is Sathish";
		 String[] words = s.split(" ");  //splitting each word from the string

		 String reversedString = "";
		 
		 for(String e : words) {   // iterate through the words in string array
			 String reversedword = "";
			 for(int i=e.length()-1; i>=0; i--) {  // reverse the words in string array
				 reversedword = reversedword+e.charAt(i);
			 }
			 reversedString = reversedString+reversedword+" ";
		 }

		 System.out.println(reversedString);
		 
		 String str = "100A";
		 String a = str.replace("100A", "100");
		 int i = Integer.parseInt(a);
		 System.out.println(i);
		 
	}

}
