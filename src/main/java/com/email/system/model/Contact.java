package com.email.system.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "eml_contact")
public class Contact implements Serializable {
	private static final long serialVersionUID = -1064772402462394556L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@Column(nullable = false)
	private String email;
	private String firstname;
	private String lastname;
	private String company;
	private String address;
	private String zipCode;
	private String country;
	private String phone;
	private String fax;
	private String job;
	private Date birthday;
	@Type(type = "yes_no")
	private boolean subscription;

	public Contact() {
	}

	public Contact(Long id, String name, String email, String firstname,
			String lastname, String company, String address, String zipCode,
			String country, String phone, String fax, String job,
			Date birthday, boolean subscription) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.company = company;
		this.address = address;
		this.zipCode = zipCode;
		this.country = country;
		this.phone = phone;
		this.fax = fax;
		this.job = job;
		this.birthday = birthday;
		this.subscription = subscription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public boolean isSubscription() {
		return subscription;
	}

	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}

}
