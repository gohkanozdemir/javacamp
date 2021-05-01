package odev1.Nisan21;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private int percentageOfCompletion;
	
	public Student() {}
	
	/**
	 * @param id
	 * @param firstName
	 * @param lastNameString
	 * @param password
	 */
	public Student(int id, String firstName, String lastName, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
