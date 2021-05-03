package odev3.model;

import java.time.LocalDate;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdentity;
	private LocalDate dateOfBirth;

	public Gamer() {
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param nationalIdentity
	 * @param dateOfBirth
	 */
	public Gamer(int id, String firstName, String lastName, String nationalIdentity, LocalDate dateOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param nationalIdentity
	 * @param dateOfBirth
	 */
	public Gamer(String firstName, String lastName, String nationalIdentity, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.dateOfBirth = dateOfBirth;
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

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
