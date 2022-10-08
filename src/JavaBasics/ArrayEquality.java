package JavaBasics;

public class ArrayEquality {

	public static void main(String[] args) {
		int array1[] = {2,1,3,5,4,8};
		int array2[] = {2,1,3,5,4,8};
		
		boolean equalOrNot = true;
		if(array1.length == array2.length) {
			for(int i=0; i<array1.length;i++) {
				if(array1[i]!=array2[i]) {
					equalOrNot = false;
				}
			}
		}
		else {
			equalOrNot = false;
		}
		if(equalOrNot) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}

	}

}
