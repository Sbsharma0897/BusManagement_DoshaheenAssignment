package com.BusManagement.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Seat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer seatId;
	private String seatNumber;
	@Enumerated(EnumType.ORDINAL)
	private SeatTypeEnum seatType;
	private boolean seatBooked;
	
	@ManyToOne
	private Bus bus;
	
	

}
