package com.email.system.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eml_optionlist")
public class OptionList implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long optionId;
	@Column(nullable=false)
	private String optionName;
	@Column(nullable=false)
	private int optionValue;
	private Date created;
	private Date updated;
	
	
	public OptionList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OptionList(String optionName, int optionValue, Date created,
			Date updated) {
		super();
		this.optionName = optionName;
		this.optionValue = optionValue;
		this.created = created;
		this.updated = updated;
	}

	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	public int getOptionValue() {
		return optionValue;
	}
	public void setOptionValue(int optionValue) {
		this.optionValue = optionValue;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
}
