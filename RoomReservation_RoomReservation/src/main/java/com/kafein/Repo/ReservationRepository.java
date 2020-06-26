package com.kafein.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kafein.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {


	Reservation findByStartsGreaterThanEqualAndEndsLessThanEqualAndRoom_Id(String startDate, String endDate, Integer roomID);


	@Query(value = "select * from reservations r where r.starts <= :startDate and r.ends >= :endDate and r.roomID = :roomID", nativeQuery = true)
	Reservation findDateCheck(@Param("startDate") String startDate, @Param("endDate") String endDate, Integer roomID);
	
	
}
