
public class User {
	private String firstName;
	private String lastName;
	private String mail;
	private String address;
	private int userId;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String mail, String address, int userId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.address = address;
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}
	
	
	
}
