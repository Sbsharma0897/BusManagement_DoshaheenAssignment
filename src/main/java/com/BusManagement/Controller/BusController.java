package com.BusManagement.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BusManagement.Payloads.BusDto;
import com.BusManagement.Service.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {
	
	@Autowired
	private BusService busService;
	
	@GetMapping("/{busNumber}")
	private ResponseEntity<BusDto> fetchSingleBusDetails(@Valid @PathVariable String busNumber)
	{
		BusDto busDto=busService.fetchSingleBusDetails(busNumber);
		
		
		return new ResponseEntity<BusDto>(busDto,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	private ResponseEntity<List<BusDto>> fetchAllBusDetails()
	{
		List<BusDto> list=busService.fetchAllBusDetails();
		
		return new ResponseEntity<List<BusDto>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/insert")
	private ResponseEntity<BusDto> insertNewBus(@Valid @RequestBody BusDto busDto)
	{
		BusDto receivedBusDto=busService.insertNewBus(busDto);
		
		return new ResponseEntity<BusDto>(receivedBusDto,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{busNumber}")
	private ResponseEntity<BusDto> deleteABus(@Valid @PathVariable String busNumber)
	{
		BusDto busDto=busService.deleteABus(busNumber);
		
		return new ResponseEntity<BusDto>(busDto,HttpStatus.ACCEPTED);
	}
	

}
