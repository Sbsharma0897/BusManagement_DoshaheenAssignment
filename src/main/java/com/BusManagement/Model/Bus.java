package com.BusManagement.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Bus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer busId;
    
	@Column(unique = true)
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
