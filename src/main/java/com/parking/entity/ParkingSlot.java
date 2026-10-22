package com.parking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  @Table(name="Parking")
public class ParkingSlot {
	@Id
	private int slotId;
	
	@Column(unique = true)
	private int vehicalNumber;
	
	private String vehicaltype;
	@Column (unique = true)
	private String ownername;
	
	private int parkingFee;
	
	private String slotStetus;
	
	
	public int getSlotId() {
		return slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public int getVehicalNumber() {
		return vehicalNumber;
	}

	public void setVehicalNumber(int vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}

	public String getVehicaltype() {
		return vehicaltype;
	}

	public void setVehicaltype(String vehicaltype) {
		this.vehicaltype = vehicaltype;
	}

	public String getOwnername() {
		return ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public int getParkingFee() {
		return parkingFee;
	}

	public void setParkingFee(int parkingFee) {
		this.parkingFee = parkingFee;
	}

	public String getSlotStetus() {
		return slotStetus;
	}

	public void setSlotStetus(String slotStetus) {
		this.slotStetus = slotStetus;
	}

	public ParkingSlot(int slotId, int vehicalNumber, String vehicaltype, String ownername, int parkingFee,
			String slotStetus) {
		super();
		this.slotId = slotId;
		this.vehicalNumber = vehicalNumber;
		this.vehicaltype = vehicaltype;
		this.ownername = ownername;
		this.parkingFee = parkingFee;
		this.slotStetus = slotStetus;
	}

	public ParkingSlot() {
		super();
	}

	
	
	
	
	

}
