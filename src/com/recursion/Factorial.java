package com.recursion;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorialWithTailRecu(5,1));
		System.out.println(factorWithRecu(5));
	}
	
	/* Iterative Approach */
	static int factorial(int num) {
		int result = 1;
		while(num>0) {
			result*=num;
			num--;
		}
		return result;
	}
	
	/* Tail Recursion kind of optimized sol */
	static int factorialWithTailRecu(int num,int result) {
		if(num<=0) {
			return result;
		}
		result*=num;
		//tail recursion
		return factorialWithTailRecu(num-1,result);
	}
	
	
	/* General Recursion sol */
	static int factorWithRecu(int num) {
		
		if(num==0 || num==1) 
			return 1;
		
		return num * factorWithRecu(num-1);
		
	}
}
