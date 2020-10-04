package com.carlopugao.phone;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone iphone = new IPhone("11", 96, "AT&T", "Ring ring!");
		Galaxy galaxy = new Galaxy("Note", 90, "Sprint", "Pick up the phone!");
		
		iphone.displayInfo();
		System.out.println(iphone.ring());
		System.out.println(iphone.unlock());
		
		galaxy.displayInfo();
		System.out.println(galaxy.ring());
		System.out.println(galaxy.unlock());
	}
}
