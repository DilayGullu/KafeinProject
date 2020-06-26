package com.kafein.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kafein.Entity.Reservation;
import com.kafein.Entity.Room;
import com.kafein.Repo.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService {
	
	private RoomRepository roomrepository;

	
	public RoomServiceImpl(RoomRepository roomrepository) {
		this.roomrepository = roomrepository;
	}

	@Override
	public List<Room> roomList() {
		return roomrepository.findAll();

	}

	@Override
	public Room findOne(Integer id) {
		// TODO Auto-generated method stub
		return roomrepository.findById(id).get();
	}

	@Override
	public Room addRoom(Room room) {
		// TODO Auto-generated method stub
		return roomrepository.save(room);
	}
	

	
	@Override
	public String deleteRoom(Integer id) {
		roomrepository.deleteById(id);
		return "{'message':'Room deleted successfully'}";
	}

}