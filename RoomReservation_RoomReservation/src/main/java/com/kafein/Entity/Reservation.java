package com.kafein.Entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;


@Entity
@Table(name="reservations")
public class Reservation {
	
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id	
	private Integer id;
	
	
    @Column(name = "starts")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape= Shape.STRING)
    private String starts;

    @Column(name = "ends")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape= Shape.STRING)
    private String ends;

    private transient Integer roomID;
    
    private transient Integer companyID;
    
    
    
    @ManyToOne
    @JoinColumn(name="roomID")
    private Room room;
    

    @ManyToOne
    @JoinColumn(name="companyID")
    private Company company;
    
    
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnds() {
		return ends;
	}

	public void setEnds(String ends) {
		this.ends = ends;
	}


	public String getStarts() {
		return starts;
	}

	public void setStarts(String starts) {
		this.starts = starts;
	}
	
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	
	
	public Integer getRoomID() {
		return roomID;
	}

	public void setRoomID(Integer roomID) {
		this.roomID = roomID;
	}

	public Integer getCompanyID() {
		return companyID;
	}

	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}

	public Reservation() {
		
	}

	public Reservation(Integer id, String starts, String ends) {
		super();
		this.id = id;
		this.starts = starts;
		this.ends = ends;
	}
	
 
}
