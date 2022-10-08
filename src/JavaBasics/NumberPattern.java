package JavaBasics;

public class NumberPattern {

	public static void main(String[] args) {

		for(int i=0; i<4; i++) {
			for(int j=0; j<=9; j++) {
				System.out.print(i+""+j+"\t");
			}
			System.out.println();
		}
		
//		int n[] = new int[5];
//		n[0] = 4;
//		n[1] = 3;
//		n[2] = 2;
//		n[3] = 1;
//		n[4] = 0;
//		
//		for(int i =0; i<n.length; i++) {
//			System.out.println("n = "+n[i]);
//		}
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				for(int k=1;k<=i;k++) {
					System.out.print(j);
				}
			}
			System.out.println(" ");
		}
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
