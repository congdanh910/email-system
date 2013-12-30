package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import com.email.system.dao.EmailScheduleDAO;
import com.email.system.model.EmailSchedule;

public class EmailScheduleDAOImpl extends GenericDAOImpl<EmailSchedule, Long> implements EmailScheduleDAO {

	public EmailScheduleDAOImpl(
			@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
