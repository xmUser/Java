package com.demo;

class Calculator {
	public int add(int a, int b){
		return a + b;
	}
	public int increase(int a) {
        return ++a;
    }
    public static void main(String args[]) {
		Calculator calculator = new Calculator();
		int x = 10;
		int y = calculator.increase(x);
		System.out.println(x);
		System.out.println(y);
	} 
}
