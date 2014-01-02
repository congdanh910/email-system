package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.email.system.dao.BlackListDAO;
import com.email.system.model.BlackList;
@Repository("blackListDAO")
public class BlackListDAOImpl extends GenericDAOImpl<BlackList, Long> implements BlackListDAO {

	@Autowired
	public BlackListDAOImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
