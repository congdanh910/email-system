package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.email.system.dao.ListAddressDAO;
import com.email.system.model.ListAddress;
@Repository("listAddressDAO")
public class ListAddressDAOImpl extends GenericDAOImpl<ListAddress, Long> implements ListAddressDAO{

	@Autowired
	public ListAddressDAOImpl(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
