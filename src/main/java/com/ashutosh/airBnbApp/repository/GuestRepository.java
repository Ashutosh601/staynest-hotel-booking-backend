package com.ashutosh.airBnbApp.repository;

import com.ashutosh.airBnbApp.entity.Guest;
import com.ashutosh.airBnbApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}