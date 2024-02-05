package com.marketingapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapplication.dto.LeadDto;
import com.marketingapplication.entity.Lead;
import com.marketingapplication.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	//http://localhost:8080/view
//	handler method
	//spring web
	@RequestMapping("/view")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
//	@RequestMapping("/saveLead")
//	public String saveLead(Lead lead,Model model) {
//		leadService.saveLead(lead);
//		model.addAttribute("msg", "Record saved!");
//		return "create_lead";
//	}
//	@RequestMapping("/saveLead")
//	public String saveLead(@RequestParam("first") String firstName,
//			@RequestParam("last")String lastName,
//			@RequestParam("email")String email,
//			@RequestParam("mobile")long mobile
//			,Model model) {
//		Lead lead=new Lead();
//		lead.setFirstName(firstName);
//		lead.setLastName(lastName);
//		lead.setEmail(email);
//		lead.setMobile(mobile);
//		
//		leadService.saveLead(lead);
//		model.addAttribute("msg", "Record saved!");
//		return "create_lead";
//	}
	@RequestMapping("/saveLead")
	public String saveLead(LeadDto leadDto,Model model) {
		Lead lead=new Lead();
		lead.setFirstName(leadDto.getFirstName());
		lead.setLastName(leadDto.getLastName());
		lead.setEmail(leadDto.getEmail());
		lead.setMobile(leadDto.getMobile());
		
		leadService.saveLead(lead);
		model.addAttribute("msg", "Record saved!");
		return "create_lead";
	}
}
