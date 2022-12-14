package com.BusManagement.Payloads;

import java.time.Year;
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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.CreatedDate;

import com.BusManagement.Model.DecisionEnum;
import com.BusManagement.Model.Seat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BusDto {
	
	@Pattern(regexp ="[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}", message = "Invalid Bus Number")
	private String busNumber;
	
	@NotNull(message = "Year must not be null")
	private String manufactuerYear;
	@NotNull @NotEmpty 
	private String  manufacturer;
	@Min(value = 1, message="Seat Number not valid")
	@Max(value = 1000,message = "Seat Number not valid")
	private Integer seatCapacity;
	@Min(value = 2, message="Number of Axle below the defined limit")
	@Max(value = 14, message="Number of Axle above the defined limit")
	private Integer numberOfAxle;
	@NotNull
	private Integer PricePerSeat;
	@Min(value = 2,message = "Invalid Seating capacity")
	@Max(value = 4,message = "Invalid Seating capacity")
	private Integer seatsPerRow;
	
	@Enumerated(EnumType.ORDINAL)
	@NotNull 
	private DecisionEnum  AC;
	@NotNull @NotBlank
	private String  travelAgency;
	@Enumerated(EnumType.ORDINAL)
	@NotNull 
	private DecisionEnum sleeper;
	@Enumerated(EnumType.ORDINAL)
	@NotNull 
	private DecisionEnum wifi;
	@Enumerated(EnumType.ORDINAL)
	@NotNull 
	private DecisionEnum tvPerSeat;
	
	

	
	
	

}
