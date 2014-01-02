package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.email.system.dao.AuthorityDAO;
import com.email.system.model.Authority;
@Repository("authorityDAO")
public class AuthorityDAOImpl extends GenericDAOImpl<Authority, String> implements AuthorityDAO{

	@Autowired
	public AuthorityDAOImpl(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
