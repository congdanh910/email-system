package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.email.system.dao.EmailScheduleDAO;
import com.email.system.model.EmailSchedule;

@Repository("emailScheduleDAO")
public class EmailScheduleDAOImpl extends GenericDAOImpl<EmailSchedule, Long> implements EmailScheduleDAO {
	@Autowired
	public EmailScheduleDAOImpl(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
