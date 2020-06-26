package com.kafein.Entity;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="company")
public class Company {

	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id	
    private int id;
	
	@Column(name = "companyname")
	private String companyname;
	
	@Column(name = "personelcount")
	private int personelcount;
	
	@Column(name = "province")
	private String province;
	
	@OneToMany(targetEntity= Reservation.class, mappedBy = "company", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Reservation> reservation;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public int getPersonelcount() {
		return personelcount;
	}
	public void setPersonelcount(int personelcount) {
		this.personelcount = personelcount;
	}
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Company() {
		
	}
	

	public Company(int id, String companyname, int personelcount, String province) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.personelcount = personelcount;
		this.province = province;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Company{" +
				"id=" + id + 
				", companyname='" + companyname + '\'' +
				", personelcount='" + personelcount + '\'' +
				'}';
	}
	
	
}