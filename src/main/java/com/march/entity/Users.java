package com.march.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Users {
	
	@Id
	@Column(name = "id")
	private String userId;
	private String email;
	private String mobile;
	
	@JsonIgnore
	private String password;
	private boolean status;
	
	@OneToOne(mappedBy = "user")
	@JsonManagedReference
	private Profiles profile;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(String userId, String email, String mobile, String password, boolean status, Profiles profile) {
		super();
		this.userId = userId;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.status = status;
		this.profile = profile;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Profiles getProfile() {
		return profile;
	}

	public void setProfile(Profiles profile) {
		this.profile = profile;
	}
}
