package com.email.system.utils.mapper;

import java.io.Serializable;

public class OptionListMapper implements Serializable {
	
	private String optionName;
	private int optionValue;
	
	
	public OptionListMapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OptionListMapper(String optionName, int optionValue) {
		super();
		this.optionName = optionName;
		this.optionValue = optionValue;
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
	

}
