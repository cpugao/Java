package com.carlopugao.objectmaster;

public class Ninja extends Humans {

		private int stealth = 10;
		
		public void steal(Humans human) {
			human.setHealth(human.getHealth() - stealth);
			setHealth(getHealth() + stealth);
		}
		
		public void runaway() {
			setHealth(getHealth() -10);
		}
}
