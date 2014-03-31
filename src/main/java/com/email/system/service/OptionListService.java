package com.email.system.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.email.system.model.OptionList;

public interface OptionListService extends GenericService<OptionList, Long>{
	public List<OptionList> findBy(Pageable pageable);

	public Long countFindBy();
}
