package JavaBasics;

public class CallByRefAndValue {
	
	String name;
	double version;
	String vendor;
	
	public void Browser(CallByRefAndValue br) {
		System.out.println(br.name+ " " +br.version+" "+br.vendor);
		
	}

	public static void main(String[] args) {
		
		CallByRefAndValue b = new CallByRefAndValue();
		b.name = "Chrome";
		b.version = 91.07;
		b.vendor = "Google";
		b.Browser(b); // reference is passed

	}

}
