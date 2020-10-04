package com.carlopugao.objectmaster;

public class Humans {
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	private int health = 100;
	
	public Humans() {}
	
	public Humans(int health) {
	    this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public void attack(Humans human) {
		human.setHealth(human.getHealth()-strength);
	}
	
	public void displayHealth() {
		System.out.println(health);
	}
}
