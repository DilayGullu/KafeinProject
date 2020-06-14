package com.kafein.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kafein.Entity.Reservation;
import com.kafein.Entity.Room;
import com.kafein.Repo.RoomRepository;


public interface RoomService {
	
	/*
	@Autowired
	private RoomRepository repo;
	
	public List<Room> listAll(){
		return repo.findAll();
	}
	public void save(Room room) {
		repo.save(room);
	}
	public Room get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	*/
	
	List<Room> roomList();
	
	Room findOne(Integer id);
	
	Room addRoom(Room room);
	
	String deleteRoom(Integer id);


}
