package com.kafein.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafein.Entity.Company;
import com.kafein.Entity.Room;
import com.kafein.Service.CompanyService;
import com.kafein.Service.RoomService;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService service;
	
	@GetMapping("/company")
	private List<Company> list(){
		return service.companyList();
	}
	
	
	@RequestMapping("/company/{id}")
	public Company findOne(@PathVariable Integer id) {
		return service.findOne(id);
	}
	
	
	@RequestMapping("/company/add")
	public Company addCompany(@RequestBody Company company) {
		return service.addCompany(company);
	}
	
	
	@RequestMapping("/company/delete/{id}")
	public String deleteCompany(@PathVariable Integer id) {
		return service.deleteCompany(id);
	}
	

}
