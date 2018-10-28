package association;

public class Contact {
	private String phoneNo;
	private String email;
	
	
	public Contact(String phoneNo, String email) {
		super();
		this.phoneNo = phoneNo;
		this.email = email;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Contact [phoneNo=" + phoneNo + ", email=" + email + "]";
	}
	
	
	
	
	
}
