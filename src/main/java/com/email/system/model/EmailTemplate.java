package com.email.system.model;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "eml_template")
public class EmailTemplate implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(nullable = false, length = 255)
	private String name;
	@Column(nullable = false, length = 255)
	private String subject;
	@Column(nullable = false)
	@Lob
	private String content;
	private File[] fileAttached;
	@OneToOne
	private User user;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "modified_date")
	private Date modifiedDate;

	public EmailTemplate() {
	}

	public EmailTemplate(Long id, String name, String subject, String content,
			File[] fileAttached, User user, Date createDate, Date modifiedDate) {
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.content = content;
		this.fileAttached = fileAttached;
		this.user = user;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public File[] getFileAttached() {
		return fileAttached;
	}

	public void setFileAttached(File[] fileAttached) {
		this.fileAttached = fileAttached;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
