package com.email.system.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.email.system.model.OptionList;

public interface OptionListDAO extends GenericDAO<OptionList, Long>{
	public List<OptionList> findBy(Pageable pageable);

	public Long countFindBy();
}
