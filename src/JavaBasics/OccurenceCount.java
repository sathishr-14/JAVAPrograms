package JavaBasics;

public class OccurenceCount {

	public static int occurences(int num[], int x) {
		
		int res = 0;
		for(int i=0; i<num.length; i++) {
			if(x==num[i]) {
				res++;
			}
		}
		return res;
	}
	
	public static int Occurence(String str, String s) {
		int res = 0;
		for(int i=0; i<str.length(); i++) {
			if(s.equals(str.charAt(i))) {
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 1, 2, 5, 5,1};
		int x = 5;
//		int n = num.length;
		System.out.println(x +" Occurence count is " +occurences(num, x));
		
		String str = "Sathish";
		String s = "S";
		System.out.println(s +" Occurence count is "+ Occurence(str, s));
		
		
//		System.out.println("Duplicate numbers : ");
//		int arr[] = {1,2,3,4,1,3,5};
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j= i+1; j<arr.length; j++) {
//				if(arr[j]==arr[i]) {
//					System.out.println(arr[i]);
//				}
//			}
//		}
	}

}
