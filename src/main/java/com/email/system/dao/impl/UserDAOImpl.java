package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import com.email.system.dao.UserDAO;
import com.email.system.model.User;

public class UserDAOImpl extends GenericDAOImpl<User, Long> implements UserDAO{

	public UserDAOImpl(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
