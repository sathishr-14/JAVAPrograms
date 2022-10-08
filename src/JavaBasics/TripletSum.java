package JavaBasics;

public class TripletSum {

	public static void main(String[] args) {
		int a[] = {1, 4, 45, 6, 10, 8};
		int sum = 22;
		triplet(a, sum);
	}

	public static void triplet(int a[], int sum) {
		for(int i=0; i<a.length-2; i++) {
			for(int j=i+1; j<a.length-1; j++) {
				for(int k=j+1; k<a.length; k++) {
					if(a[i]+a[j]+a[k]==sum) {
						System.out.println("Triplet is : "+a[i]+","+a[j]+","+a[k]);
					}
				}
			}
		}
	}
}
