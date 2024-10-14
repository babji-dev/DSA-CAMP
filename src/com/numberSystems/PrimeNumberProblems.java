package com.numberSystems;

public class PrimeNumberProblems {
	public static void main(String[] args) {
		System.out.println("-- With General Approach --");
		for(int i=1;i<40;i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
		System.out.println("\n\n-- With Sieve of Eratosthenes algorithm --");
		sieveMethodOfPrime(40,new boolean[41]);
		
	}
	
	static boolean isPrime(int n) {
		
		if(n<=1) return false;
		/* 
		 i*i<=n or i<=Math.sqrt(n)
		 apply square on both sides.
		*/
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	static void sieveMethodOfPrime(int n, boolean[] primes) {
		
		for(int i=2;i<=n;i++) {
			if(!primes[i]) {
				for(int j=i*2;j<=n;j+=i) {
					primes[j]=true;
				}
			}
		}
		
		for(int i=2;i<=n;i++) {
			if(!primes[i]) {
				System.out.print(i+ " ");
			}
		}
		
	}
	
}
