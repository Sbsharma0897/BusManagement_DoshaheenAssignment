package com.BusManagement.Model;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Pattern;

import org.springframework.context.annotation.Bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.asm.Advice.This;

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
	private String  travelAgency;
	
	private Integer PricePerSeat;
	private Integer seatsPerRow;
	
	
	@OneToMany(mappedBy ="bus", cascade = CascadeType.ALL)
	private List<Seat> seats=new ArrayList<>();
	
	@Enumerated(EnumType.ORDINAL)
	private DecisionEnum  AC;
	@Enumerated(EnumType.ORDINAL)
	private DecisionEnum sleeper;
	@Enumerated(EnumType.ORDINAL)
	private DecisionEnum wifi;
	@Enumerated(EnumType.ORDINAL)
	private DecisionEnum tvPerSeat;
	
	
	
	
	
	

}
