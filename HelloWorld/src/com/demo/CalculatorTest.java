package com.demo;

class CalculatorTest {
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		int c = calculator.add(1, 3);
		int d = 9;
		int e = calculator.add(c, c * d);
		System.out.println(c);
		System.out.println(e);
	}
}
