package com.march.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Profiles {

	@Id
	@Column(name = "id")
	private String profileId;
	private String name;
	private Date dob;
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user")
	@JsonBackReference
	private Users user;

	public Profiles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profiles(String profileId, String name, Date dob, String address, Users user) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.dob = dob;
		this.address = address;
		this.user = user;
	}

	public String getProfileId() {
		return profileId;
	}

	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
}
