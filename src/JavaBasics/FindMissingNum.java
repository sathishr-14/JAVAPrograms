package JavaBasics;

public class FindMissingNum {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,7};
		int n = missingNum(num, 7);
		System.out.println("Missing number is : "+n);
	}
	
	public static int missingNum(int num[], int totalCount) {
		int expSum = totalCount*(totalCount+1)/2;
		int actualSum = 0;
		
		for(int i : num) {
			actualSum=actualSum+i;
		}
		return expSum - actualSum;
	}

}
