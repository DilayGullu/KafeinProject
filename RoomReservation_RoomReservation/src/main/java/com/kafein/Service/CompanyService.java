package com.kafein.Service;

import java.util.List;


import com.kafein.Entity.Company;

public interface CompanyService {

	List<Company> companyList();
	
	Company findOne(Integer id);
	
	Company addCompany(Company company);
	
	String deleteCompany(Integer id);

	

}