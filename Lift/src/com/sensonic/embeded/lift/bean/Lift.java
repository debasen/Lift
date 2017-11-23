package com.sensonic.embeded.lift.bean;

import java.util.List;

public class Lift {

	private final int liftNo;
	private final int maxCapacity;
	private List<Integer> dutyFloors;
	private boolean isCrowded;
	private boolean isUnderMaintenance;
	private boolean isOverDuty;
	
	
	public Lift(int liftNo, int maxCapacity) {
		super();
		this.liftNo = liftNo;
		this.maxCapacity = maxCapacity;
	}

	public List<Integer> getDutyFloors() {
		return dutyFloors;
	}

	public void setDutyFloors(List<Integer> dutyFloors) {
		this.dutyFloors = dutyFloors;
	}

	public boolean isCrowded() {
		return isCrowded;
	}

	public void setCrowded(boolean isCrowded) {
		this.isCrowded = isCrowded;
	}

	public boolean isUnderMaintenance() {
		return isUnderMaintenance;
	}

	public void setUnderMaintenance(boolean isUnderMaintenance) {
		this.isUnderMaintenance = isUnderMaintenance;
	}

	public boolean isOverDuty() {
		return isOverDuty;
	}

	public void setOverDuty(boolean isOverDuty) {
		this.isOverDuty = isOverDuty;
	}

	public int getLiftNo() {
		return liftNo;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}
	
	
}
