package com.email.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.email.system.dao.UserDAO;
import com.email.system.model.User;
import com.email.system.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public User findById(Long id, boolean lock) {
		return userDAO.findById(id, lock);
	}

	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}

	@Override
	public List<User> findByExample(User exampleInstance, String... excludeProperty) {
		return userDAO.findByExample(exampleInstance, excludeProperty);
	}

	@Override
	public User makePersistent(User entity) {
		return userDAO.makePersistent(entity);
	}

	@Override
	public void makeTransient(User entity) {
		userDAO.makeTransient(entity);
	}

	@Override
	public void flush() {
		userDAO.flush();
	}

	@Override
	public void clear() {
		userDAO.clear();
	}

	@Override
	public List<User> findBy(Pageable pageable) {
		return userDAO.findBy(pageable);
	}

	@Override
	public Long countFindBy() {
		return userDAO.countFindBy();
	}

}
