package com.email.system.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.email.system.dao.OptionListDAO;
import com.email.system.model.OptionList;
import com.email.system.model.User;
@Repository("optionListDAO")
public class OptionListDAOImpl extends GenericDAOImpl<OptionList, Long> implements OptionListDAO {

	@Autowired
	public OptionListDAOImpl(@Qualifier("sessionFactory")SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public List<OptionList> findBy(Pageable pageable) {
		Criteria criteria = getCurrentSession().createCriteria(OptionList.class);
		if(pageable != null){
			System.out.println("offset " + pageable.getOffset() + "  pagesize " + pageable.getPageSize());
			criteria.setFirstResult(pageable.getOffset());
			criteria.setMaxResults(pageable.getPageSize());
		}
		return criteria.list();
	}

	@Override
	public Long countFindBy() {
		Criteria criteria = getCurrentSession().createCriteria(OptionList.class);
		criteria.setProjection(Projections.rowCount());
		return ((Long) criteria.list().get(0));
	}



}
