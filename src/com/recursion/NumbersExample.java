package com.recursion;

public class NumbersExample {
	
	public static void main(String[] args) {
		printNumber(1);
	}
	
	static void printNumber(int number) {
		//base condition
		if(number==5) {
			System.out.println(number);
			return;
		}
		System.out.println(number);
		printNumber(number+1);
	}

}
