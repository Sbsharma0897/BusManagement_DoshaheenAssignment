package com.BusManagement.Service;

import java.util.List;

import com.BusManagement.Payloads.BusDto;

import com.BusManagement.Payloads.BusSeatsDto;



public interface BusService {
	
	
	public BusDto fetchSingleBusDetails(String busNumber);
	
	public List<BusDto> fetchAllBusDetails();
	
	public BusDto insertNewBus(BusDto busDto);
	
    public BusDto deleteABus(String busNumber);
    
    public BusSeatsDto fetchSingleBusDetailsWithSeats(String busNumber); 
    

}
