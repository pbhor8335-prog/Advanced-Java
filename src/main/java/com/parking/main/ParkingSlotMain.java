package com.parking.main;

import java.util.List;

import com.parking.controller.ParkingSlotController;
import com.parking.entity.ParkingSlot;

public class ParkingSlotMain {
	
	public static void main(String[] args) {
		ParkingSlotController controller =new ParkingSlotController();
		
		
//		ParkingSlot slot=new ParkingSlot(103,1102,"Two Wheller","Unknown",500,"Available");
//		
////		slot.
//		String s = controller.saveParking(slot);
//		System.out.println(s);
		
		
//		ParkingSlot id = controller.getByParkingId(101);
//		
//		System.out.println(id.getSlotId());
//		System.out.println(id.getVehicalNumber());
//		System.out.println(id.getVehicaltype());
//		System.out.println(id.getOwnername());
//		System.out.println(id.getParkingFee());
//		System.out.println(id.getSlotStetus());
//		System.out.println();
		
		
//		List<ParkingSlot> slots = controller.getByAllId();
//		
//		for(ParkingSlot s:slots)
//		{
//			System.out.println(s.getSlotId());
//			System.out.println(s.getSlotStetus());
//			System.out.println(s.getOwnername());
//			System.out.println(s.getParkingFee());
////			System.out.println(s.getSlotStetus());
//			System.out.println(s.getVehicalNumber());
//			System.out.println(s.getVehicaltype());
//			
//			System.out.println("-----------------------------");
//		}
		
//		ParkingSlot slot=new ParkingSlot();
//		
//		slot.setVehicalNumber(5656);
//		slot.setOwnername("Amit buchke");
//		slot.setParkingFee(100);
//		slot.setSlotStetus("Available");
//		slot.setVehicaltype("Two Wheller");
//		slot.setSlotId(101);
//		
//		
//		String msg = controller.updateParking(slot, 101);
//		
//		System.out.println(msg);
		
		String msg = controller.deleteparking(101);
		
		System.out.println(msg);
	}

}
