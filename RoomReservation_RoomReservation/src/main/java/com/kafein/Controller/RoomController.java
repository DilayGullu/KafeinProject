package com.kafein.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafein.Entity.Room;
import com.kafein.Service.RoomService;


@RestController
public class RoomController {
	
	@Autowired
	private RoomService service;

	
	@GetMapping("/room")
	private List<Room> list(){
		return service.roomList();
	}
	
	
	@RequestMapping("/room/{id}")
	public Room findOne(@PathVariable Integer id) {
		return service.findOne(id);
	}
	
	
	@PostMapping("/room")
	public Room addRoom(@RequestBody Room room) {
		return service.addRoom(room);
	}
	
	
	@RequestMapping("/room/delete/{id}")
	public String deleteRoom(@PathVariable Integer id) {
		return service.deleteRoom(id);
	}
	

}