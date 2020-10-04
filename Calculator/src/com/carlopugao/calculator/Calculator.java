package com.carlopugao.calculator;

public class Calculator {
	private Double operandOne = 0.0;
	private Double operandTwo = 0.0;
	private Double mathResult = 0.0;
	private String operation = "";
	
	public Calculator(Double operandOne, Double operandTwo, String operation) {
		this.operandOne = operandOne;
		this.operation = operation;
		this.operandTwo = operandTwo;
	}

	public Double getOperandOne() {
		return operandOne;
	}

	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}

	public Double getOperandTwo() {
		return operandTwo;
	}

	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public Double getMathResult() {
		return mathResult;
	}

	public void setMathResult(Double mathResult) {
		this.mathResult = mathResult;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void performOperation() {
		if (getOperation().equals("+")) {
			Double result = getOperandOne() + getOperandTwo();
			setMathResult(result);
		}
		else if (getOperation().equals("-")) {
			Double result = getOperandOne() - getOperandTwo();
			setMathResult(result);
		}
	}
	
	public void getResults() {
		System.out.println(getMathResult());
	}
}
