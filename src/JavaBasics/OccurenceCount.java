package JavaBasics;

public class OccurenceCount {

	public static int occurences(int num[], int n, int x) {
		
		int res = 0;
		for(int i =0; i<n; i++) {
			if(x==num[i]) {
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int num[] = { 1, 2, 3, 4, 1, 2, 5, 5,1};
		int x = 5;
		int n = num.length;
		System.out.println("Count of occurences " +occurences(num, n, x));
		
		
		System.out.println("Duplicate numbers : ");
		int arr[] = {1,2,3,4,1,3,5};
		
		for(int i=0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(arr[j]==arr[i]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
