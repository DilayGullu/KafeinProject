package com.kafein.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafein.Entity.Reservation;
import com.kafein.Service.ReservationService;

@RestController
public class ReservationController {

	@Autowired
	private ReservationService service;
	
	@GetMapping("/reservation")
	private List<Reservation> list(){
		return service.reservationList();
	}
	
	@RequestMapping("/reservation/{id}")
	public Reservation findOne(@PathVariable Integer id) {
		return service.findOne(id);
	}
	
	
	@RequestMapping("/reservation/add")
	public String addReservation(@RequestBody Reservation reservation) {
		service.addReservation(reservation);
		return "{'message':'The meeting room has been reserved successfully'}"; 
	}
	
	
	@RequestMapping("/reservation/delete/{id}")
	public String deleteReservation(@PathVariable Integer id) {
		return service.deleteReservation(id);
	}
	
	
	/* 
    public List<Room> availableSearchedRooms(String city, int capacity, String from, String to){
		
		List<Room> toShow = new ArrayList<>();
		for (Room r : roomsByCityAndCapacity(city, capacity)) {

			Date[] dates = reservationService.findAllByRoomId(r.getId());

			if (dates.length == 0) {
				toShow.add(r);

			} else if (dates.length > 0) {
				for (int i = 0; i < dates.length; i++) {
					if (reservationService.starts(from).isAfter(dates[i].getEnd()) && i == dates.length - 1) {
						toShow.add(r);
					} else if (reservationService.starts(from).isAfter(dates[i].getEnd()) && reservationService.endDate(to).isBefore(dates[i + 1].getStart())) {
						toShow.add(r);
					}
				}
			}

		}
		return toShow;
	}
	*/
	
	/*
	public List<Room> roomsByCityAndCapacity(String city, int capacity) {
		List<Room> byLocal = roomRepo.findAllByLocalizationCity(city);
		List<Room> byHotel = roomRepo.findAllByHotelAddressCity(city);
		byLocal.addAll(byHotel);
		List<Room> tmp = new ArrayList<>();
		for (Room r : byLocal) {
			if (!tmp.contains(r) && r.getCapacity() >= capacity) {
				tmp.add(r);
			}
		}
		return tmp;
	}
	*/
	
}
