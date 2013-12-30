package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import com.email.system.dao.AuthorityDAO;
import com.email.system.model.Authority;

public class AuthorityDAOImpl extends GenericDAOImpl<Authority, String> implements AuthorityDAO{

	public AuthorityDAOImpl(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
