package com.recursion;

public class RecursionExamples {

	public static void main(String[] args) {
		/*Beginner Recursion Problems*/
		sayHello(5);
		reverseString("Hello");
		System.out.println("Power of a Number : "+powerOfNumber(2, 3));
		System.out.println("is Palindrome : "+ispalindrom("saippuakivikauppias", 0, 18));
		System.out.println("Fibanoic serier : " +fib(5));
		System.out.println("Sum Of Digits : "+sumOfDigits(254,0));
		int[] arr = {15,16,20,24,56,78,89,99};
		System.out.println("Binary Search : "+ BinarySearch(arr, 89, 0, arr.length-1));
	}
	
	
	/* Use Debugger for better understanding */
	static void sayHello(int counter) {
		if(counter<0) {
			return;
		}
		System.out.println("Hi!");
		sayHello(counter-1);
		System.out.println("Inside SayHello() :: "+counter);
	}
	
	static void reverseString(String str) {
		
		if(str==null || str.length()<1) {
			System.out.println(str);
		}else {
			System.out.print(str.substring(str.length()-1));
			reverseString(str.substring(0,str.length()-1));
		}
		
	}

	/* 2,3 -> 2*2*2 (8) */
	static int powerOfNumber(int n, int power) {
		
		if(power==1) {
			return n*power;
		}
		
		return n*powerOfNumber(n,power-1);
	}
	
	static boolean ispalindrom(String str,int start,int end) {
		
		if(start==end && str.charAt(start)==str.charAt(end))
			return true;
		
		if(start>=end) {
			return false;
		}
		
		if(str.charAt(start)==str.charAt(end))
			return ispalindrom(str, start+1, end-1);
		else {
			return false;
		}
	}
	
	static int fib(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*fib(n-1);
		
	}
	
	/* 254 => 2+5+4 = 11*/
	static int sumOfDigits(int num,int sum) {
		
		if(num==0)
			return sum;
		
		sum+=(num%10);
	
		return sumOfDigits(num/10, sum);
		
	}
	
	static int BinarySearch(int[] arr,int target,int start,int end) {
		int middle = (start+end)/2;
		
		if(arr[middle]==target)
			return middle;
		
		if(start>=end)
			return -1;
		
		if(target>arr[middle]) 
				return BinarySearch(arr, target, middle+1, end);
		else
			return BinarySearch(arr, target, start, middle-1);
	}

}
