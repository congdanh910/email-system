package com.email.system.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.hibernate.annotations.Type;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User implements Serializable, UserDetails {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	@Column(nullable = false, length = 30, unique = true)
	private String username;
	@Column(nullable = false, length = 32)
	private String password;
	@Column(nullable = false, length = 100)
	private String fullName;
	private String company;
	private String address;
	private String country;
	@Column(nullable = false, length = 20)
	private String phone;
	@Column(nullable = false)
	private String email;
	@Column(name = "userLimit")
	private int limit;
	@Column(name = "key_search")
	private String keySearch;
	private String[] accesss;
	@OneToOne(cascade = CascadeType.ALL)
	private User parent;
	@Type(type = "yes_no")
	private boolean enabled;
	@Column(name = "account_non_expired")
	@Type(type = "yes_no")
	private boolean accountNonExpired;
	@Column(name = "credentials_non_expired")
	@Type(type = "yes_no")
	private boolean credentialsNonExpired;
	@Column(name = "account_non_locked")
	@Type(type = "yes_no")
	private boolean accountNonLocked;
	@Column(name = "create_date")
	private Date createDate;
	@Column(name = "modified_date")
	private Date modifiedDate;

	public User() {
	}

	public User(String username, String password, String fullName,
			String company, String address, String country, String phone,
			String email, int limit, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,
			boolean accountNonLocked, String keySearch, String[] accesss,
			User parent, Date createDate, Date modifiedDate) {
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.company = company;
		this.address = address;
		this.country = country;
		this.phone = phone;
		this.email = email;
		this.limit = limit;
		this.enabled = enabled;
		this.accountNonExpired = accountNonExpired;
		this.credentialsNonExpired = credentialsNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.keySearch = keySearch;
		this.accesss = accesss;
		this.parent = parent;
		this.createDate = createDate;
		this.modifiedDate = modifiedDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public String getKeySearch() {
		return keySearch;
	}

	public void setKeySearch(String keySearch) {
		this.keySearch = keySearch;
	}

	public String[] getAccesss() {
		return accesss;
	}

	public void setAccesss(String[] accesss) {
		this.accesss = accesss;
	}

	public User getParent() {
		return parent;
	}

	public void setParent(User parent) {
		this.parent = parent;
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

	@PrePersist
	protected void onCreate() {
		this.createDate = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.modifiedDate = new Date();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		if (this.getAccesss() != null) {
			for (String access : this.getAccesss()) {
				authorities.add(new SimpleGrantedAuthority(access));
			}
		}
		return authorities;
	}
}
