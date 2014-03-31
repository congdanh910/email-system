package com.email.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.email.system.dao.OptionListDAO;
import com.email.system.model.OptionList;
import com.email.system.service.OptionListService;
@Service("optionListService")
@Transactional
public class OptionListServiceImpl implements OptionListService{

	@Autowired
	private OptionListDAO OptionListDAO;
	
	@Override
	public OptionList findById(Long id, boolean lock) {
		// TODO Auto-generated method stub
		return OptionListDAO.findById(id, lock);
	}

	@Override
	public List<OptionList> findAll() {
		// TODO Auto-generated method stub
		return OptionListDAO.findAll();
	}

	@Override
	public List<OptionList> findByExample(OptionList exampleInstance,
			String... excludeProperty) {
		// TODO Auto-generated method stub
		return OptionListDAO.findByExample(exampleInstance, excludeProperty);
	}

	@Override
	public OptionList makePersistent(OptionList entity) {
		// TODO Auto-generated method stub
		return OptionListDAO.makePersistent(entity);
	}

	@Override
	public void makeTransient(OptionList entity) {
		// TODO Auto-generated method stub
		OptionListDAO.makeTransient(entity);
		
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		OptionListDAO.flush();
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		OptionListDAO.clear();
	}

	@Override
	public List<OptionList> findBy(Pageable pageable) {
		// TODO Auto-generated method stub
		return OptionListDAO.findBy(pageable);
	}

	@Override
	public Long countFindBy() {
		// TODO Auto-generated method stub
		return OptionListDAO.countFindBy();
	}

}
