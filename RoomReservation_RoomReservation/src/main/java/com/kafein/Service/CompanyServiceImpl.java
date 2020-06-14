package com.kafein.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kafein.Entity.Company;
import com.kafein.Entity.Room;
import com.kafein.Repo.CompanyRepository;
import com.kafein.Repo.RoomRepository;


@Service
public class CompanyServiceImpl implements CompanyService {

	
	private CompanyRepository companyrepository;

	
	public CompanyServiceImpl(CompanyRepository companyrepository) {
		this.companyrepository = companyrepository;
	}

	@Override
	public List<Company> companyList() {
		return companyrepository.findAll();
	}

	@Override
	public Company findOne(Integer id) {
		return companyrepository.findById(id).get();
	}

	@Override
	public Company addCompany(Company company) {
		return companyrepository.save(company);
	}

	@Override
	public String deleteCompany(Integer id) {
		companyrepository.deleteById(id);
		return "{'message':'Company deleted successfully'}";
	}

}
