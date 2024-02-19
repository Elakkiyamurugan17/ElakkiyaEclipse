package com.example.model.mo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hotel {
	private  String hotelName;
	private int hotelId;
	private Address address;
	

}
