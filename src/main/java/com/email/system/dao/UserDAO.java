package com.email.system.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.email.system.model.User;

public interface UserDAO extends GenericDAO<User, Long>{
	public List<User> findBy(Pageable pageable);

	public Long countFindBy();
}