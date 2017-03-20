package io.egen.pojoClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // jpa
public class User {
	@Id
	private String id;
	private String firstName;
	private String lastName;

	@Column(unique = true)
	private String email;
	private String city;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}