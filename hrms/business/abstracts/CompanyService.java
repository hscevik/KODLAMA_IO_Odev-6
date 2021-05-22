package com.hrms.hrms.business.abstracts;

import java.util.List;

import com.hrms.hrms.entities.concretes.Company;

public interface CompanyService {

	List<Company> getCompanyAll() ;
	Company addCompany(Company company);
}
