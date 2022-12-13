package com.BusManagement.Exception;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ErrorDetails {
	
	private String message;
	private LocalDateTime timeStamp;
	private String description;
	
	

}
