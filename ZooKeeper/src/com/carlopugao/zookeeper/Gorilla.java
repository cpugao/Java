package com.carlopugao.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("The gorilla threw something.");
		this.setEnergyLevel(this.getEnergyLevel() -5);
	}
	
	public void eatBananas() {
		System.out.println("The gorilla ate bananas.");
		this.setEnergyLevel(this.getEnergyLevel() +10);
	}
	
	public void climb() {
		System.out.println("The gorilla climbed.");
		this.setEnergyLevel(this.getEnergyLevel() -10);
	}
}
