package JavaBasics;

public class RotateArray {

	public static void main(String[] args) {
		rotate(6);
	}
	
	public static void rotate(int n) {
		for(int i = n; i>0; i--) {
			int count = 0;
			for(int j=i; j>0; j--) {
				System.out.print(j);
				count++;
			}
			for(int k=n; k>count; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
	
