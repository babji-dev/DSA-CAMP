package com.recursion;

public class PatternRecursion {
	
	public static void main(String[] args) {
		//printStarPatterItr(44);
		printStarPatternRec(0, 0, 5);
	}
	
	static void printStarPatterItr(int n) {
		for(int i=0; i<n;i++) {
			for(int j=0; j<n-i;j++ ) {
				System.out.print("* ");
			}
				
			System.out.println();
		}
	}
	
	static  void printStarPatternRec(int row,int col,int n) {
		
		if((row<n) && col<(n-row)) {
			System.out.print("* ");
			printStarPatternRec(row, col+1, n);
		}
		
		if((row<n) && col>=(n-row)) {
			System.out.println();
			printStarPatternRec(row+1, 0, n);
		}
		
		if(row>=n) {
			return;
		}
	}

}
