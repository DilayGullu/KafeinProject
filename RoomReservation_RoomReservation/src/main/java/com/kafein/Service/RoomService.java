package com.kafein.Service;

import java.util.List;


import com.kafein.Entity.Room;


public interface RoomService {
	
	
	List<Room> roomList();
	
	Room findOne(Integer id);
	
	Room addRoom(Room room);
	
	String deleteRoom(Integer id);


}