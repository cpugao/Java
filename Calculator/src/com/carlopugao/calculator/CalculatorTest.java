package com.carlopugao.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculation1 = new Calculator(3.0, 5.0, "+");
		Calculator calculation2 = new Calculator(30.0, 10.0, "-" );
		
		calculation1.performOperation();
		calculation2.performOperation();
		
		calculation1.getResults();
		calculation2.getResults();
	}

}
