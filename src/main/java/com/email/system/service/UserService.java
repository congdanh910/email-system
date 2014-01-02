package com.email.system.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.email.system.model.User;

public interface UserService extends GenericService<User, Long> {
	public List<User> findBy(Pageable pageable);

	public Long countFindBy();
}
