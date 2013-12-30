package com.email.system.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Campaign implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, length = 255)
	private String name;
	@OneToMany
	private Set<ListAddress> listAddresses;
	@OneToOne
	private EmailTemplate template;
	@OneToOne
	private User user;
	private int status;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "modified_date")
	private Date modifiedDate;

	public Campaign() {
	}

	public Campaign(Long id, String name, Set<ListAddress> listAddresses,
			EmailTemplate template, User user, int status, Date createDate,
			Date modifiedDate) {
		this.id = id;
		this.name = name;
		this.listAddresses = listAddresses;
		this.template = template;
		this.user = user;
		this.status = status;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
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

	public Set<ListAddress> getListAddresses() {
		return listAddresses;
	}

	public void setListAddresses(Set<ListAddress> listAddresses) {
		this.listAddresses = listAddresses;
	}

	public EmailTemplate getTemplate() {
		return template;
	}

	public void setTemplate(EmailTemplate template) {
		this.template = template;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
