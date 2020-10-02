package com.carlopugao.objectmaster;

public class HumansTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Humans player1 = new Humans();
		//Humans player2 = new Humans();
		
		//player1.attack(player2);
		//player2.displayHealth();
		//player2.attack(player1);
		//player2.attack(player1);
		//player1.displayHealth();
		
		Ninja ninja1 = new Ninja();
		Ninja ninja2 = new Ninja();
		
		Wizard wizard1 = new Wizard();
		
		Samurai samurai1 = new Samurai();
		Samurai samurai2 = new Samurai();
		
		ninja1.steal(samurai1);
		ninja1.displayHealth();
		samurai1.displayHealth();
		
		wizard1.heal(ninja1);
		wizard1.displayHealth();
		
		samurai2.deathBlow(ninja2);
		samurai1.meditate();
		samurai2.displayHealth();
		samurai1.displayHealth();
		
		System.out.println(samurai1.howMany());
	}

}
