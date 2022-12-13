package com.BusManagement.Payloads;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

import com.BusManagement.Model.DecisionEnum;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BusDto {
	
	
	private String busNumber;
	
	private String manufactuerYear;
	private String  manufacturer;
	private Integer seatCapacity;
	private Integer numberOfAxle;
	@Enumerated(EnumType.ORDINAL)
	private DecisionEnum  AC;
	private String  travelAgency;
	@Enumerated(EnumType.ORDINAL)
	private DecisionEnum sleeper;
	@Enumerated(EnumType.ORDINAL)
	private DecisionEnum wifi;
	@Enumerated(EnumType.ORDINAL)
	private DecisionEnum tvPerSeat;

}
