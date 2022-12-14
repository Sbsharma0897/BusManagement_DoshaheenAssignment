package com.BusManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BusManagement.Model.Seat;

@Repository
public interface SeatRepo extends JpaRepository<Seat, Integer> {

}
