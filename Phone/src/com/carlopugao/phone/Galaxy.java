package com.carlopugao.phone;

public class Galaxy extends Phone implements Ringable {
	public Galaxy (String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
		System.out.println("Galaxy " + getVersionNumber() + " says ");
		return getRingTone();
	}
	@Override
	public String unlock() {
		return "Finger print match, unlocked";
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier() + " has " + getBatteryPercentage() + "% battery charge.");
	}
}
