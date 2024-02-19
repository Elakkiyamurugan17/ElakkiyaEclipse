package com.example.model.serviceimpl;

import org.springframework.stereotype.Component;

import com.example.model.mo.Address;
import com.example.model.mo.Hotel;
import com.example.model.ser.HotelService;

@Component
public class ServiceImpl implements HotelService {

	@Override
	public Hotel getHotel() {
		Address a= new Address("chennai", 458509);
		Hotel hi=new Hotel("KFC", 56, a);
		return hi;
	}

	
	}
	


