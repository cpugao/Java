package com.carlopugao.zookeeper;

public class Bat extends Mammal {
	
	public Bat() {
		this.setEnergyLevel(300);
	}
	
	public void fly() {
		System.out.println("Bat is flying!");
		this.setEnergyLevel(this.getEnergyLevel() -50);
	}
	
	public void eatHumans() {
		System.out.println("Bat attacked humans!");
		this.setEnergyLevel(this.getEnergyLevel() -25);
	}
	
	public void attackTown() {
		System.out.println("Bat attacked a town!");
		this.setEnergyLevel(this.getEnergyLevel() -100);
	}
}
