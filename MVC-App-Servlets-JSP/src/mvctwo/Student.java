package mvctwo;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	
	public Student(String firstname, String lastName, String email) {
		super();
		this.firstName = firstname;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstname() {
		return firstName;
	}

	public void setFirstname(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
