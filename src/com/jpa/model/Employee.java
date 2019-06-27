package com.jpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	@Id
	private int idEmployee;
	private String email;
	private String firstname;
	private String lastname;

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Employee() {
		super();
	}

	public Employee(int idEmployee, String email, String firstname, String lastname) {
		super();
		this.idEmployee = idEmployee;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee [idEmployee=" + idEmployee + ", email=" + email + ", firstname=" + firstname + ", lastname="
				+ lastname + "]";
	}

}
