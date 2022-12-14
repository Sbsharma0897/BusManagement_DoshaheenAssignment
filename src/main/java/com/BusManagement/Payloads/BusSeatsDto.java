package com.BusManagement.Payloads;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.BusManagement.Model.DecisionEnum;
import com.BusManagement.Model.Seat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BusSeatsDto {
	
  
	private String busNumber;
	private String manufactuerYear;
	private String  manufacturer;
	private Integer seatCapacity;
	private Integer numberOfAxle; 
	private String  travelAgency;
	
	private Integer PricePerSeat;
	private Integer seatsPerRow;
    
	private List<SeatDto> seats=new ArrayList<>();
	
	@Enumerated(EnumType.ORDINAL)
	private DecisionEnum  AC;
	@Enumerated(EnumType.ORDINAL)
	private DecisionEnum sleeper;
	@Enumerated(EnumType.ORDINAL)
	private DecisionEnum wifi;
	@Enumerated(EnumType.ORDINAL)
	private DecisionEnum tvPerSeat;
	

}
