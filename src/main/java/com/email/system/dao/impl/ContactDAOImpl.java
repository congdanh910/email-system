package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import com.email.system.dao.ContactDAO;
import com.email.system.model.Contact;

public class ContactDAOImpl extends GenericDAOImpl<Contact, Long> implements ContactDAO {

	public ContactDAOImpl(
			@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
