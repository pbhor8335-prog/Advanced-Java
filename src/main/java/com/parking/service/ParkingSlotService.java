package com.parking.service;

import java.util.List;

import com.parking.deo.ParkingSlotDeo;
import com.parking.entity.ParkingSlot;

public class ParkingSlotService {
	
	ParkingSlotDeo deo=new ParkingSlotDeo();
	
	public String saveParking(ParkingSlot slot) {
		
		return deo.saveData(slot);
	}
	
	public ParkingSlot getByParkingId(int id)
	{
		return deo.getByParkingId(id);
	}
	
	public List<ParkingSlot> getAllParking()
	{
		return deo.getByAllId();
	}
	
	public String updateparking(ParkingSlot slot,int id)
	{
		return deo.updateParkingSlot(slot, id);
	}
	
	public String deleteParking(int id)
	{
		return deo.deleteparking(id);
	}

}
