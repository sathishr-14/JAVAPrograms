package JavaBasics;

public class SingleDigit {

	public static void main(String[] args) {
		
		int num = 98987;
		int sum = 0;
		while(num>0) {
			sum = sum+num%10;
			num = num/10;
			if(num==0 && sum>9) {
				num=sum;
				sum=0;
			}
		}
		System.out.println(sum);

	}

}
                                                                                                                                                                                    