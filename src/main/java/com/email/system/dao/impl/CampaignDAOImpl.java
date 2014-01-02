package com.email.system.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.email.system.dao.CampaignDAO;
import com.email.system.model.Campaign;
@Repository("campaignDAO")
public class CampaignDAOImpl extends GenericDAOImpl<Campaign, Long> implements CampaignDAO{

	@Autowired
	public CampaignDAOImpl(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
