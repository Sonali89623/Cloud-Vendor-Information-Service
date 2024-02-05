package com.cloudvendorapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cloudvendorapi.model.CloudVendor;
import com.cloudvendorapi.repository.CloudVendorRepository;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
	
	CloudVendorRepository cloudVendorRepository;
	
	public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "successfully saved!!";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "updated successfully";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "successfully deleted";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		//cloudVendorRepository.findById(cloudVendorId).get();
		return cloudVendorRepository.findById(cloudVendorId).get();//get bcz return type is optional so i get the desired value of particular object
		//returning particular data back to the controller layer on basis of id
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		
		return cloudVendorRepository.findAll();//returning entire list back to the controller layer
	}

}
