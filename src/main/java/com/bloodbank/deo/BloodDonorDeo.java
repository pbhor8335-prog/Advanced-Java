package com.bloodbank.deo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.bloodbank.entity.BloodDonor;
import com.bloodbank.util.HibernateBloodDonorUtil;

public class BloodDonorDeo {
	
	public String saveBloodData(BloodDonor donor)
	{
		try {
			
			Session session = HibernateBloodDonorUtil.getSessionFactory().openSession();
			
			Transaction tr = session.beginTransaction();
			
			session.persist(donor);
			
			tr.commit();
			
			return "Inserted The Data";
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public BloodDonor getByIdBloodDonor(int id)
	{
		try {
			
			Session session = HibernateBloodDonorUtil.getSessionFactory().openSession();
			
			BloodDonor donor = session.get(BloodDonor.class, id);
			
			return donor;
			
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public List<BloodDonor> getByAllId() {
		
		try {
			
			Session session = HibernateBloodDonorUtil.getSessionFactory().openSession();
			
			List<BloodDonor> donors = session.createQuery("from BloodDonor",BloodDonor.class).getResultList();
			
			return donors;
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public String updateBloodDonor(BloodDonor donor,int id)
	{
		try {
			
			Session session = HibernateBloodDonorUtil.getSessionFactory().openSession();
			
			Transaction tr = session.beginTransaction();
			
			BloodDonor dbdonor = session.get(BloodDonor.class, id);
			
//			dbdonor.setDonorId(donor.getDonorId());
			dbdonor.setDonorName(donor.getDonorName());
			dbdonor.setAge(donor.getAge());
			dbdonor.setBloodgroup(donor.getBloodgroup());
			dbdonor.setCity(donor.getCity());
			dbdonor.setContactNumber(donor.getContactNumber());
			
			session.persist(dbdonor);
			tr.commit();
			
			return "Updated BloodDonor";
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public String delete(int id)
	{
		try {
			
			Session session = HibernateBloodDonorUtil.getSessionFactory().openSession();
			
			Transaction tr = session.beginTransaction();
			
			BloodDonor donor = session.get(BloodDonor.class, id);
			
			session.remove(donor);
			
			tr.commit();
			
			return "Deleted";
			
		}catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

}
