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
			return service.addReservation(reservation);
	}
	
	
	@RequestMapping("/reservation/delete/{id}")
	public String deleteReservation(@PathVariable Integer id) {
		return service.deleteReservation(id);
	}
	
	
}