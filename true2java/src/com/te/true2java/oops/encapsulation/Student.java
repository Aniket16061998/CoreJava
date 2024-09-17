package com.te.true2java.oops.encapsulation;

import java.time.LocalDate;
import java.util.Objects;

public class Student {

	private Integer id;
	private String firstname;
	private String lastname;
	private LocalDate dateOfAdmission;
	private Float feespaid;
	private Float feespending;
	public Student(Integer id, String firstname, String lastname, LocalDate dateOfAdmission, Float feespaid,
			Float feespending) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfAdmission = dateOfAdmission;
		this.feespaid = feespaid;
		this.feespending = feespending;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", dateOfAdmission="
				+ dateOfAdmission + ", feespaid=" + feespaid + ", feespending=" + feespending + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateOfAdmission, feespaid, feespending, firstname, id, lastname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(dateOfAdmission, other.dateOfAdmission) && Objects.equals(feespaid, other.feespaid)
				&& Objects.equals(feespending, other.feespending) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(id, other.id) && Objects.equals(lastname, other.lastname);
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}
	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}
	public Float getFeespaid() {
		return feespaid;
	}
	public void setFeespaid(Float feespaid) {
		this.feespaid = feespaid;
	}
	public Float getFeespending() {
		return feespending;
	}
	public void setFeespending(Float feespending) {
		this.feespending = feespending;
	}
	

}
