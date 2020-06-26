package com.kafein.Service;

import java.util.List;

import javax.sound.sampled.ReverbType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kafein.Entity.Reservation;
import com.kafein.Entity.Room;
import com.kafein.Repo.CompanyRepository;
import com.kafein.Repo.ReservationRepository;
import com.kafein.Repo.RoomRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	private ReservationRepository reservationRepository; 
	private RoomRepository roomrepository;
	private CompanyRepository companyrepository;
	
	
	
	@Autowired
	public ReservationServiceImpl(ReservationRepository reservationRepository,RoomRepository roomrepository, CompanyRepository companyrepository) {
		this.reservationRepository = reservationRepository;
		this.roomrepository = roomrepository;
		this.companyrepository = companyrepository;

	}

	@Override
	public List<Reservation> reservationList() {
		return reservationRepository.findAll();
	}

	@Override
	public Reservation findOne(Integer id) {
		return reservationRepository.findById(id).get();
	}
	
	@Override
	public String addReservation(Reservation reservation) {
		if (checkRoom(reservation)) {
			return "{'message':'Meeting room has been reserved. Please try for other times'}";
		}
		
		reservation.setRoom(roomrepository.findById(reservation.getRoomID()).get());
		reservation.setCompany(companyrepository.findById(reservation.getCompanyID()).get());
		
		
		  if(reservation.getCapacity() > roomrepository.findById(reservation.getRoomID()).get().getCapacity())
		{
			return  "{message:This meeting room’s capacity restricted X people X= "+ (roomrepository.findById(reservation.getRoomID()).get().getCapacity()).toString() +"}";
		}
		  
		
			reservationRepository.save(reservation);

			return "{'message':'The meeting room has been reserved successfully'}";
		
	}

	
	public Boolean checkRoom(Reservation reservation) {
		Reservation currentReservation = reservationRepository.findByStartsGreaterThanEqualAndEndsLessThanEqualAndRoom_Id(reservation.getStarts(), reservation.getEnds(), reservation.getRoomID());
		Reservation betweenReservation = reservationRepository.findDateCheck(reservation.getStarts(), reservation.getEnds(), reservation.getRoomID());
		
		
		if (currentReservation != null || betweenReservation !=null) {
			return true;
		}
		
		return false;
	}
	
	
	
	@Override
	public String deleteReservation(Integer id) {
		reservationRepository.deleteById(id);
		return "{'message':'Reservation deleted successfully'}";
	}



}
