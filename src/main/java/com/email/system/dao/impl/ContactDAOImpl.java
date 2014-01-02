package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.email.system.dao.ContactDAO;
import com.email.system.model.Contact;
@Repository("contactDAO")
public class ContactDAOImpl extends GenericDAOImpl<Contact, Long> implements ContactDAO {

	@Autowired
	public ContactDAOImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
