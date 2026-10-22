package com.parking.deo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.parking.entity.ParkingSlot;
import com.parking.util.HibernateParkingUtil;

public class ParkingSlotDeo {
	
	public String saveData(ParkingSlot slot)
	{
		try {
			
			Session session = HibernateParkingUtil.getSessionFactory().openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.persist(slot);
			
			tr.commit();
			
			return "Inserted data";
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public ParkingSlot  getByParkingId(int id)
	{
		try {
			
//			Session session = HibernateParkingUtil.getSessionFactory().openSession();
//			
//			ParkingSlot slot = session.get(ParkingSlot.class, id);
//			
//			return slot;
			
			Session session = HibernateParkingUtil.getSessionFactory().openSession();
			
			ParkingSlot slot = session.get(ParkingSlot.class, id);
			
			return slot;
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public List<ParkingSlot> getByAllId()
	{
		try {
//		Session session = HibernateParkingUtil.getSessionFactory().openSession();
//		
//		List<ParkingSlot> slots = session.createQuery("from ParkingSlot",ParkingSlot.class).getResultList();
//
//			return slots;
			
			Session session = HibernateParkingUtil.getSessionFactory().openSession();
			List<ParkingSlot> slots = session.createQuery("from ParkingSlot",ParkingSlot.class).getResultList();
			return slots;
		
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	
	}
	
	public String updateParkingSlot(ParkingSlot slot,int id)
	{
		try {
			
			
			Session session = HibernateParkingUtil.getSessionFactory().openSession();
			
			Transaction tr = session.beginTransaction();
			
			ParkingSlot dbparking = session.get(ParkingSlot.class, id);
			
			dbparking.setVehicalNumber(slot.getVehicalNumber());
			dbparking.setOwnername(slot.getOwnername());
			dbparking.setParkingFee(slot.getParkingFee());
			dbparking.setSlotStetus(slot.getSlotStetus());
			dbparking.setVehicaltype(slot.getVehicaltype());
			
			session.persist(dbparking);
			
			tr.commit();
			
			
			return "Parking is Upadted ";
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public String deleteparking(int id)
	{
		try {
			
			Session session = HibernateParkingUtil.getSessionFactory().openSession();
			
			Transaction tr = session.beginTransaction();
			
			ParkingSlot slot = session.get(ParkingSlot.class, id);
			
			session.remove(slot);
			
			tr.commit();
			
			return "Deleted";
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

}
