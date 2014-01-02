package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.email.system.dao.UserDAO;
import com.email.system.model.User;

@Repository("userDAO")
public class UserDAOImpl extends GenericDAOImpl<User, Long> implements UserDAO{

	@Autowired
	public UserDAOImpl(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
