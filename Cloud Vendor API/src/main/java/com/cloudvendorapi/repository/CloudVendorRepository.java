package com.cloudvendorapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudvendorapi.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String>{

}
