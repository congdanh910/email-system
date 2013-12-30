package com.email.system.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMAIL_SCHEDULE")
public class EmailSchedule implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne
	private Campaign campaign;
	@OneToOne
	private User user;
	private int status;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "finised _date")
	private Date finishedDate;

	public EmailSchedule() {

	}

	public EmailSchedule(Long id, Campaign campaign, User user, int status,
			Date createDate, Date finishedDate) {
		super();
		this.id = id;
		this.campaign = campaign;
		this.user = user;
		this.status = status;
		this.createDate = createDate;
		this.finishedDate = finishedDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
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

	public Date getFinishedDate() {
		return finishedDate;
	}

	public void setFinishedDate(Date finishedDate) {
		this.finishedDate = finishedDate;
	}

}
