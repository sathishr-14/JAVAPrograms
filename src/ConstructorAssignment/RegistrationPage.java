package ConstructorAssignment;

public class RegistrationPage {
	
	private String fname;
	private String lname;
	private String email;
	private String number;
	private String pwd;
	private String cfm_pwd;

	// constructor
	public RegistrationPage(String fname, String lname, String email, String number, String pwd, String cfm_pwd) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.number = number;
		this.pwd = pwd;
		this.cfm_pwd = cfm_pwd;
	}

	// getter & setter
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCfm_pwd() {
		return cfm_pwd;
	}

	public void setCfm_pwd(String cfm_pwd) {
		this.cfm_pwd = cfm_pwd;
	}
	
	
}
