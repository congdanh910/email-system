package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import com.email.system.dao.CampaignDAO;
import com.email.system.model.Campaign;

public class CampaignDAOImpl extends GenericDAOImpl<Campaign, Long> implements CampaignDAO{

	public CampaignDAOImpl(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
