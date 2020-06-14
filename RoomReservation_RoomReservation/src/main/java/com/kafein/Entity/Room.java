package com.kafein.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="room")
public class Room {
	
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id	
	private Integer id;
	
	@Column(name = "roomname")
	private String roomname;
	
	@Column(name = "capacity")
	private Integer capacity;
	
	@Column(name = "province")
	private String province;
	
	@Column(name = "county")
	private String county;

	@OneToMany(targetEntity= Reservation.class, mappedBy = "room", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Reservation> reservation;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	

   public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

public Room() {
		
	}

	public Room(Integer id, String roomname, Integer capacity, String province, String county) {
		super();
		this.id = id;
		this.roomname = roomname;
		this.capacity = capacity;
		this.province = province;
		this.county = county;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Room{" +
				"id=" + id + 
				", roomname='" + roomname + '\'' +
				", capacity='" + capacity + '\'' +
				'}';
	}
	
	
	

}
