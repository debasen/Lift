package com.sensonic.embeded.lift.bean;

/**
 * @author Debapriya
 *
 */
public class Floor {

	private final int floorNo;
	private int assignedLift;
	private boolean isUpPressed;
	private boolean isDownPressed;
	private int upWaitingTime;
	private int downWaitingTime;
	
	public Floor(int floorNo) {
		super();
		this.floorNo = floorNo;
	}

	public int getAssignedLift() {
		return assignedLift;
	}

	public void setAssignedLift(int assignedLift) {
		this.assignedLift = assignedLift;
	}

	public boolean isUpPressed() {
		return isUpPressed;
	}

	public void setUpPressed(boolean isUpPressed) {
		this.isUpPressed = isUpPressed;
	}

	public boolean isDownPressed() {
		return isDownPressed;
	}

	public void setDownPressed(boolean isDownPressed) {
		this.isDownPressed = isDownPressed;
	}

	public int getUpWaitingTime() {
		return upWaitingTime;
	}

	public void setUpWaitingTime(int upWaitingTime) {
		this.upWaitingTime = upWaitingTime;
	}

	public int getDownWaitingTime() {
		return downWaitingTime;
	}

	public void setDownWaitingTime(int downWaitingTime) {
		this.downWaitingTime = downWaitingTime;
	}

	public int getFloorNo() {
		return floorNo;
	}
	
}
