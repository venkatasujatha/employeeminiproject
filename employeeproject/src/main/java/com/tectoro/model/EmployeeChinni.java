package com.tectoro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class EmployeeChinni 
{
	@Id
	
	private int id;
	private String firstName;
	private String lastName;
	private int experience;
	private long salary;
	public EmployeeChinni(int id, String firstName, String lastName, int experience, long salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.experience = experience;
		this.salary = salary;
	}
	public EmployeeChinni() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeChinni [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", experience="
				+ experience + ", salary=" + salary + "]";
	}
	
}
