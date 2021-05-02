package Entity;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirthday;
	private long nationalityId;
	
	
	public Customer(int id, String firstName, String lastName, int dateOfBirthday, long nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirthday = dateOfBirthday;
		this.nationalityId = nationalityId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public int getDateOfBirthday() {
		return dateOfBirthday;
	}


	public void setDateOfBirthday(int dateOfBirthday) {
		this.dateOfBirthday = dateOfBirthday;
	}


	public long getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
