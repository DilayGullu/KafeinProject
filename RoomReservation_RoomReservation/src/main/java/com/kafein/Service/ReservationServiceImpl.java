package com.kafein.Service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kafein.Entity.Company;
import com.kafein.Entity.Reservation;
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
	public Reservation addReservation(Reservation reservation) {
		reservation.setRoom(roomrepository.findById(reservation.getRoomID()).get());
		reservation.setCompany(companyrepository.findById(reservation.getCompanyID()).get());
		return reservationRepository.save(reservation);
	}

	@Override
	public String deleteReservation(Integer id) {
		reservationRepository.deleteById(id);
		return "{'message':'Reservation deleted successfully'}";
	}




}
