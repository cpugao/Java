package com.carlopugao.objectmaster;

public class Wizard extends Humans {
	
	private int intelligence = 8;
	
	public Wizard() {
		super.setHealth(50);
	}
	
	public void heal(Humans h) {
		this.setHealth(this.getHealth() + intelligence);
	}
	
	public void fireball(Humans h) {
		this.setHealth(this.getHealth() -24);
	}
}
