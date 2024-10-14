package com.numberSystems;

public class NumberSystemsExamples {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,4,3,2,1,6,6,7,8,8};
		System.out.println(magicNumber(6));
		System.out.println(numberOfDigitsInNUmber(354321111));
		System.out.println(reverseArray(arr).toString());
		
	}
	
	static boolean isEven(int num) {
		/*
		 1 0 0 1 -> (9)
		 0 0 0 1 -> &1
		 --------------
		 0 0 0 1   => 1 odd
		 
		 & 1 will gives out last digit of binary number if it is 1 odd or even
		 
		 * */
		return (num & 1)==0;
	}
	
	static int multiplyBy2PowerN(int num, int n) {
		
		/*
		  We should use left shift operator for multiplication by 2^n
		  num<<n -> num*2powerN
		  5<<2 -> 5*2^2 => 20
		 */
		
		return num<<n;
	}
	
	static int divideBy2PowerN(int num, int n) {
		/*
		  we can use right shift operator to divide number by 2^n
		 */
		return num>>n;
	}
	
	static int findUniqueNumberOfArray(int[] arr) {
		int unique = 0;
		/*
		 XOR of any number with same will get cancelled out.
		 5^5 = 0
		 */
		for(int num : arr) {
			unique ^= num;
		}
		
		return unique;
	}
	
	static int magicNumber(int number) {
		
		int base = 5;
		int ans=0;
		while(number>0) {
			int lastDigit = number&1;
			ans+=lastDigit*base;
			number = number>>1;
			base = base * 5;
		}
		return ans;
		
	}
	
	static int numberOfDigitsInNUmber(int number) {
		int base = 10; // decimal
		 return (int) (Math.log(number)/Math.log(base) + 1);
	}
	
	static int[] reverseArray(int[] arr) {
		
		for(int i=0;i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		
		return arr;
	}
	
	
}
