package com.BusManagement.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BusManagement.Exception.BusException;
import com.BusManagement.Model.Bus;
import com.BusManagement.Payloads.BusDto;
import com.BusManagement.Repo.BusRepo;

@Service
public class BusServiceImpl implements BusService{
	
	@Autowired
	private BusRepo busRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	

	@Override
	public BusDto fetchSingleBusDetails(String busNumber) {
		
		Optional<Bus> optional=busRepo.findByBusNumber(busNumber);
		
		if(!optional.isPresent())
		{
			throw new BusException("Bus with number "+busNumber+" not found in the datatbase");
		}
		Bus bus=optional.get();
		
		BusDto busDto=modelMapper.map(bus, BusDto.class);
		
		return busDto;
		
	}

	@Override
	public List<BusDto> fetchAllBusDetails() {
		
        List<Bus> list=busRepo.findAll();
		
		if(list.isEmpty())
		{
			throw new BusException("No buses present in the database");
		}
		
		List<BusDto> dtoList=list.stream()
				.map(bus->modelMapper.map(bus, BusDto.class))
				.collect(Collectors.toList());
		
		return dtoList;
		
	}

	@Override
	public BusDto insertNewBus(BusDto busDto) {
		
//		String busNumber=busDto.getBusNumber();
//		
//        Optional<Bus> optional=busRepo.findByBusNumber(busNumber);
//		
//		if(optional.isPresent())
//		{
//			throw new BusException("A bus with number plate of "+busNumber+" already exists in the database");
//		}
		
		Bus bus=modelMapper.map(busDto, Bus.class);
		
		Bus savedBus=busRepo.save(bus);
		
		return modelMapper.map(savedBus,BusDto.class);
		
		
	}

	@Override
	public BusDto deleteABus(String busNumber) {
		
        Optional<Bus> optional=busRepo.findByBusNumber(busNumber);
		
		if(!optional.isPresent())
		{
			throw new BusException("Bus with number "+busNumber+" not found in the datatbase");
		}
		Bus bus=optional.get();
		busRepo.delete(bus);
		
		return modelMapper.map(bus,BusDto.class);
		
	}

}