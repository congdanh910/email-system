package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import com.email.system.dao.BlackListDAO;
import com.email.system.model.BlackList;

public class BlackListDAOImpl extends GenericDAOImpl<BlackList, Long> implements BlackListDAO {

	public BlackListDAOImpl(
			@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
