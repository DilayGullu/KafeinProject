package com.kafein.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kafein.Entity.Reservation;
import com.kafein.Repo.ReservationRepository;


public interface ReservationService {
	
	List<Reservation> reservationList();
	
	Reservation findOne(Integer id);
	
	Reservation addReservation(Reservation reservation);
	
	String deleteReservation(Integer id);
	
	
	
}
