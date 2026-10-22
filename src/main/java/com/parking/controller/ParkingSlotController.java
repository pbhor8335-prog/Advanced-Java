package com.parking.controller;

import java.util.List;

import com.parking.entity.ParkingSlot;
import com.parking.exception.ParkingSlotNotFoundException;
import com.parking.service.ParkingSlotService;

public class ParkingSlotController {
	
	ParkingSlotService service=new ParkingSlotService();
	
	public String saveParking(ParkingSlot slot)
	{
		return service.saveParking(slot);
	}
	
	public ParkingSlot getByParkingId(int id)
	{
		ParkingSlot slot= service.getByParkingId(id);
		if(slot==null)
		{
			throw new ParkingSlotNotFoundException("Parking not Found With Id :"+id);	
		}
		
		return slot;
	}
	
	public List<ParkingSlot> getByAllId() {
		
		return service.getAllParking();
	}
	
	public String updateParking(ParkingSlot slot,int id)
	{
		return service.updateparking(slot, id);
	}
	
	public String deleteparking(int id)
	{
		return service.deleteParking(id);
	}

}
