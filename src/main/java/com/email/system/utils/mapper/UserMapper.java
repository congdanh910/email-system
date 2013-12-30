package com.email.system.utils.mapper;

import java.io.Serializable;

public class UserMapper implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private String name;
	private String phone;
	private String company;
	private String address;
	private boolean status;

	public UserMapper() {
	}

	public UserMapper(String username, String name, String phone,
			String company, String address, boolean status) {
		this.username = username;
		this.name = name;
		this.phone = phone;
		this.company = company;
		this.address = address;
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
