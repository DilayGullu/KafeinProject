package com.kafein.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kafein.Entity.Company;

public interface CompanyRepository extends JpaRepository<Company,Integer> {


}
