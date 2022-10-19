package youTubeDemo;

public class Person extends Customer {
	private String firstName;
	private String lastName;
	private String nationalIdentitiy;

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

	public String getNationalIdentitiy() {
		return nationalIdentitiy;
	}

	public void setNationalIdentitiy(String nationalIdentitiy) {
		this.nationalIdentitiy = nationalIdentitiy;
	}
}
