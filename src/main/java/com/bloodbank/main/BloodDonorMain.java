package com.bloodbank.main;

import java.util.List;

import com.bloodbank.controller.BloodDonorController;
import com.bloodbank.entity.BloodDonor;

public class BloodDonorMain {
	
	public static void main(String[] args) {
		BloodDonorController controller=new BloodDonorController();
		
//		BloodDonor donor=new BloodDonor(3,"Suyog Bangar","O",36,"Nashik","9233520100");
//		
//		System.out.println(controller.saveBlood(donor));
		
//		BloodDonor d = controller.getByBlood(1);
//		
//		System.out.println(d.getDonorId());
//		System.out.println(d.getDonorName());
//		System.out.println(d.getBloodgroup());
//		System.out.println(d.getAge());
//		System.out.println(d.getCity());
//		System.out.println(d.getContactNumber());
		
//		List<BloodDonor> donor = controller.getByAllId();
//		
//		for(BloodDonor d:donor)
//		{
//			System.out.println(d.getDonorId());
//			System.out.println(d.getDonorName());
//			System.out.println(d.getAge());
//			System.out.println(d.getContactNumber());
//			System.out.println(d.getBloodgroup());
//			System.out.println(d.getCity());
//			
//			System.out.println("-------------------------------");
//		}
		
//		BloodDonor donor=new BloodDonor();
//		donor.setDonorId(1);
//		donor.setDonorName("Manisha  Gaikwad");
//		donor.setAge(55);
//		donor.setBloodgroup("A");
//		donor.setCity("Hadapser");
//		donor.setContactNumber("7774878642");
//		
//		String s = controller.updateBloodDonor(donor, 1);
//		
//		System.out.println(s);
		
		String s = controller.delete(3);
		
		System.out.println(s);
	}

}
