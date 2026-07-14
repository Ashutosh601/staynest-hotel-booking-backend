package com.ashutosh.airBnbApp.repository;

import com.ashutosh.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
