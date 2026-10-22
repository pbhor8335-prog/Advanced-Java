package com.bloodbank.service;

import java.util.List;

import com.bloodbank.deo.BloodDonorDeo;
import com.bloodbank.entity.BloodDonor;

public class BloodDonorService {
	
	BloodDonorDeo deo=new BloodDonorDeo();
	
	public String saveBlood(BloodDonor donor)
	{
		return deo.saveBloodData(donor);
	}
	
	public BloodDonor getByBloodId(int id)
	{
		return deo.getByIdBloodDonor(id);
	}
	
	public List<BloodDonor> getByAllId() {
		
		return deo.getByAllId();
	}
	
	public String updateBloodDonor(BloodDonor donor,int id)
	{
		return deo.updateBloodDonor(donor, id);
	}
	
	public String delete(int id)
	{
		return deo.delete(id);
	}

}
