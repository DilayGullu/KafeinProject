package com.kafein.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kafein.Entity.Company;
import com.kafein.Entity.Room;
import com.kafein.Repo.CompanyRepository;

public interface CompanyService {

	List<Company> companyList();
	
	Company findOne(Integer id);
	
	Company addCompany(Company company);
	
	String deleteCompany(Integer id);

	

}
