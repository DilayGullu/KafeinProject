package com.kafein.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kafein.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Integer> {


	
}
