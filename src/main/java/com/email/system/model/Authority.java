package com.email.system.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "eml_role")
public class Authority implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(nullable = false)
	private String authority;
	@Id
	@Column(name = "role_name", nullable = false, unique = true)
	private String roleName;

	public Authority() {
	}

	public Authority(String authority, String roleName) {
		this.authority = authority;
		this.roleName = roleName;
	}

//	@Override
//	public String getAuthority() {
//		return authority;
//	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
