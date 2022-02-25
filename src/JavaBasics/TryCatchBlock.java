package JavaBasics;

public class TryCatchBlock {

	String name;
	public static void main(String[] args) {
		
		TryCatchBlock obj = new TryCatchBlock();
		obj.name = "Tom";
		obj=null;
		
		System.out.println("a");
		try {
			int i = 9/0;
//			System.out.println(obj.name);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithemtic exception");
//			e.printStackTrace(); // shows the exception type
			try {
				System.out.println(obj.name);
			}
			catch(NullPointerException e1) {
				System.out.println("NPE");
			}
		}
		
		
		System.out.println("b");

	}

}
