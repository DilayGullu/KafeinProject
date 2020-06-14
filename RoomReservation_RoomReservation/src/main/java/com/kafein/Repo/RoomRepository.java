package com.kafein.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kafein.Entity.Room;

public interface RoomRepository extends JpaRepository<Room, Integer>  {


}
