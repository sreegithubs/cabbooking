package details;

public class cabdetails {
	
	private String user_name;
	private String phone_no;
	private String gender;
	

	public cabdetails(String user_name, String phone_no, String gender) {
		super();
	//	this.id = id;
		this.user_name = user_name;
		this.phone_no = phone_no;
		this.gender = gender;
		
	}
	
	public cabdetails() {
		
	}


	public String getUser_name() {
		return user_name;
	}


	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}
	
	public String getgender() {
		return gender;
	}
	
	public void setgender(String gender) {
		this.gender = gender;
	}
	

	@Override
	public String toString() {
		return "AccDetails [ user_name : " + user_name + ", phone_no : " + phone_no +",gender :"+ gender +"]";
}

}
