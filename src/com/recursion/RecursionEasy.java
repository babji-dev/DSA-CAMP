package com.recursion;

public class RecursionEasy {
	public static void main(String[] args) {
		//printNNumbersInAscOrder(5);
		System.out.println(reverseNumber(43201));
		//System.out.println(541%10);
		//System.out.println(541/10);
		System.out.println((int)(Math.log(4321)/Math.log(10)+1));
	}
	
	static void printNNumbers(int n) {
		if(n<=0) {
			return ;
		}
		System.out.print(n+" ");
		printNNumbers(n-1);
	}
	
	static void printNNumbersInAscOrder(int n) {
		
		if(n<=0) {
			return;
		}
		
		 printNNumbersInAscOrder(n-1);
		 System.out.println(n);
		
	}
	
	static int factorial(int n) {
		if(n<=1)
			return 1;
		return n*factorial(n-1);
	}
	
	
	static int sumOfDigits(int n) {
		if(n<=0)
			return 0;
		return n%10+sumOfDigits(n/10);
	}
	
	static int productOfDigits(int n) {
		if(n<=0)
			return 1;
		return n%10*sumOfDigits(n/10);	
	}
	
	// reverse a Number using recursion
	static int  reverseNumber(int n) { //1234 -> 4321
		if(n<=1) {
			return 0;
		}
		int numberOfDigits = (int)(Math.log10(n)+1);
		// for each digit multiply with 10^numberOfDigits
		// for 4  digits - 1000, 3 Digs - 100 etc.,
		return (int) (n%10*(Math.pow(10, numberOfDigits-1)) + reverseNumber(n/10));
	}

}
