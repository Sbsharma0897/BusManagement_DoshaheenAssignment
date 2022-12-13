package com.BusManagement.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BusManagement.Model.Bus;

@Repository
public interface BusRepo extends JpaRepository<Bus, Integer>{
	
	Optional<Bus> findByBusNumber(String busNumber);

}
