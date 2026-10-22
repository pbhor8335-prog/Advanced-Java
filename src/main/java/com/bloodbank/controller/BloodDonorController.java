package com.bloodbank.controller;

import java.util.List;

import com.bloodbank.entity.BloodDonor;
import com.bloodbank.service.BloodDonorService;

public class BloodDonorController {
	
	BloodDonorService service=new BloodDonorService();
	
	public String saveBlood(BloodDonor donor)
	{
		return service.saveBlood(donor);
	}

	
	public BloodDonor getByBlood(int id)
	{
		return service.getByBloodId(id);
	}
	
	public List<BloodDonor> getByAllId() {
		
		return service.getByAllId();
	}
	
	public String updateBloodDonor(BloodDonor donor,int id)
	{
		return service.updateBloodDonor(donor, id);
	}
	
	public String delete(int id)
	{
		return service.delete(id);
	}
}
