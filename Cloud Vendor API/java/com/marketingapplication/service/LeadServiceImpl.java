package com.marketingapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapplication.entity.Lead;
import com.marketingapplication.repo.LeadRepo;
@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	private LeadRepo leadRepo;
	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);

	}

}
