package com.aadiandjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  @Table(name="Students")
public class Student {
	
	@Id
	private int id;
	
	private String name;
	
	private String dep;
	
	@Column(unique = true)
	private String email;
	
	private String address;
	
	private String gender;

	public Student(int id, String name, String dep, String email, String address, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.email = email;
		this.address = address;
		this.gender = gender;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
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

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public void display() {
		
		System.out.println("Id		:"+id);
		System.out.println("Name 	:"+name);
		System.out.println("Dep  	:"+dep);
		System.out.println("Email	:"+email);
		System.out.println("Address  :"+address);
		System.out.println("Gender 	:"+gender);
	}
	
	
	
	
	
	

}
