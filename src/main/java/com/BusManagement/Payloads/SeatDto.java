package com.BusManagement.Payloads;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.BusManagement.Model.Bus;
import com.BusManagement.Model.SeatTypeEnum;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SeatDto {
	
	
	private String seatNumber;
	@Enumerated(EnumType.ORDINAL)
	private SeatTypeEnum seatType;
	private boolean seatBooked;
	


}
