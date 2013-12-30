package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import com.email.system.dao.ListAddressDAO;
import com.email.system.model.ListAddress;

public class ListAddressDAOImpl extends GenericDAOImpl<ListAddress, Long> implements ListAddressDAO{

	public ListAddressDAOImpl(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
