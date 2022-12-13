package com.BusManagement.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException ex,WebRequest req)
	{
		ErrorDetails exDetails=new ErrorDetails();
	    exDetails.setMessage(exDetails.getMessage());
	    exDetails.setTimeStamp(LocalDateTime.now());
	    exDetails.setDescription(req.getDescription(false));
	    
	    return new ResponseEntity<ErrorDetails>(exDetails,HttpStatus.BAD_REQUEST);
				
	}
	
	@ExceptionHandler(BusException.class)
	public ResponseEntity<ErrorDetails> busExceptionHandler(BusException ex,WebRequest req)
	{
		ErrorDetails exDetails=new ErrorDetails();
	    exDetails.setMessage(exDetails.getMessage());
	    exDetails.setTimeStamp(LocalDateTime.now());
	    exDetails.setDescription(req.getDescription(false));
	    
	    return new ResponseEntity<ErrorDetails>(exDetails,HttpStatus.BAD_REQUEST);
				
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> exceptionHandlerHandler(Exception ex,WebRequest req)
	{
		ErrorDetails exDetails=new ErrorDetails();
	    exDetails.setMessage(exDetails.getMessage());
	    exDetails.setTimeStamp(LocalDateTime.now());
	    exDetails.setDescription(req.getDescription(false));
	    
	    return new ResponseEntity<ErrorDetails>(exDetails,HttpStatus.BAD_REQUEST);
				
	}

}
