package com.bloodbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class BloodDonor {
	@Id
	private int donorId;
	
	private String donorName;
	
	private String bloodgroup;
	
	private int age;
	
	private String city;
	@Column(unique = true)
	private String contactNumber;

	public int getDonorId() {
		return donorId;
	}

	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public BloodDonor(int donorId, String donorName, String bloodgroup, int age, String city, String contactNumber) {
		super();
		this.donorId = donorId;
		this.donorName = donorName;
		this.bloodgroup = bloodgroup;
		this.age = age;
		this.city = city;
		this.contactNumber = contactNumber;
	}

	public BloodDonor() {
		super();
	}
	

}
