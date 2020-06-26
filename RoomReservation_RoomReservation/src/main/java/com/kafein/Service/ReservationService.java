package com.kafein.Service;

import java.util.List;


import com.kafein.Entity.Reservation;


public interface ReservationService {
	
	List<Reservation> reservationList();
	
	Reservation findOne(Integer id);
		
	String addReservation(Reservation reservation);
	
	String deleteReservation(Integer id);
	
	Boolean checkRoom(Reservation reservation);
	
		
}