package com.hrms.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.hrms.business.abstracts.CompanyService;
import com.hrms.hrms.entities.concretes.Company;

@RestController
@RequestMapping("/api/companies")
public class CompanyController {
	
	private CompanyService companyService;

	@Autowired
	public CompanyController(CompanyService companyService) {
		super();
		this.companyService = companyService;
	}
	
	@GetMapping("/getAll")
	public List<Company> getAll(){
		
		return this.companyService.getCompanyAll();
		
		
	}
	
	@PostMapping("/add")
	public Company addCompany(@RequestBody Company company) {
		
		return this.companyService.addCompany(company);
	}

}
