package com.wipro.assignments;

public class Employee {

	private int id;
	private String name;
	private String email;
	private String location;


	public int getId() {
		return id;
	}
	public Employee(int id, String name, String email, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.location = location;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
