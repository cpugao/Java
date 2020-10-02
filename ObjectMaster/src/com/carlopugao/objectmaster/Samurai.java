package com.carlopugao.objectmaster;

public class Samurai extends Humans {
	private static int samurais = 0;
	
	
	
	public void deathBlow(Humans human) {
		human.setHealth(human.getHealth() - human.getHealth());
		setHealth(health/2);
	}
	
	public void meditate() {
		health += (health/2);
	}
	
	public Samurai() {
		super.setHealth(200);
		samurais = samurais + 1;
	}
	
	public int howMany() {
		return samurais;
	}	
}
