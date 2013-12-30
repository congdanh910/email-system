package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import com.email.system.dao.EmailTemplateDAO;
import com.email.system.model.EmailTemplate;

public class EmailTemplateDAOimpl extends GenericDAOImpl<EmailTemplate, Long> implements EmailTemplateDAO{

	public EmailTemplateDAOimpl(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
