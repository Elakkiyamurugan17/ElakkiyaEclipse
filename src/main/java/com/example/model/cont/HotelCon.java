package com.example.model.cont;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.mo.Hotel;
import com.example.model.serviceimpl.ServiceImpl;

@RestController
public class HotelCon {
	@Autowired ServiceImpl impl;
	@GetMapping(value="/hotel123")
	public Hotel hotelInfo() {
		Hotel hotel1 = impl.getHotel();
		return hotel1;

	}

}
