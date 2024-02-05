package com.cloudvendorapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudvendorapi.model.CloudVendor;
import com.cloudvendorapi.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	CloudVendorService cloudVendorService;
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}
	
	//Read specific cloud vendor details from db
	@GetMapping("{vendorId}")//in browser=http://localhost:8080/cloudvendor/C1; 
	                          //o/p={"vendorId":"C1","vendorName":"Vendor1","vendorAddress":"Address1","vendorPhoneNumber":"1234"}
	
	public CloudVendor getCloudVendorDetails(@PathVariable String vendorId) {
		
		return cloudVendorService.getCloudVendor(vendorId);
		}
	
	//Read all cloud vendor details from db
	@GetMapping()
	public List<CloudVendor> getAllCloudVendorDetails() {
		return cloudVendorService.getAllCloudVendors();
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
	//request body me cldvendor object receive krre,detail isi object me daal k bhej rahe h postman me
		cloudVendorService.createCloudVendor(cloudVendor);
		return "cloud vendor create successfully"; //return success msg
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "update successful";
	}
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable String vendorId) {
		cloudVendorService.deleteCloudVendor(vendorId);
		return "deleted successful";
	}
}
