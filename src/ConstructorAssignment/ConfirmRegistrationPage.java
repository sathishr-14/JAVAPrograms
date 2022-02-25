package ConstructorAssignment;

public class ConfirmRegistrationPage {

	public static void main(String[] args) {
		
		RegistrationPage cfm = new RegistrationPage("Sathish","Kumar","Sathish123@gmail.com","9980453289","Sathish123","Sathish123");
		System.out.println("First Name :"+" " +cfm.getFname());
		System.out.println("Last Name :"+" "+cfm.getLname());
		System.out.println("Email :"+" "+cfm.getEmail());
		System.out.println("Mobile number :"+" "+cfm.getNumber());
		System.out.println("Password :"+" "+cfm.getPwd());
		System.out.println("Confirm Password :"+" "+cfm.getCfm_pwd());
		
		System.out.println("*********");
		
		System.out.println("Updated user details ------");
		
		cfm.setNumber("9908423567");
		cfm.setEmail("Sathish234@gmail.com");
		cfm.setPwd("Sathish234");
		System.out.println(cfm.getNumber());
		System.out.println(cfm.getEmail());
		System.out.println(cfm.getPwd());
	}

}
