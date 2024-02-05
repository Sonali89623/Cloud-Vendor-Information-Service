package com.marketingapplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingapplication.entity.Lead;

public interface LeadRepo extends JpaRepository<Lead, Long> {

}
