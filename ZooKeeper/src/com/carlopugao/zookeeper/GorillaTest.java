package com.carlopugao.zookeeper;

public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla gorilla = new Gorilla();
		
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		
		gorilla.eatBananas();
		gorilla.eatBananas();
		
		gorilla.climb();
		
		System.out.println("Gorilla energy level is: ");
		gorilla.displayEnergy();
	}

}
