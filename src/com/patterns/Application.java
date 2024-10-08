package com.patterns;

public class Application {

	public static void main(String[] args) {
		
		pattern8(5);
	}

	static void pattern1(int numberOfLines) {
		for(int i=1;i<=numberOfLines;i++) {
			for(int col=1;col<=i;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern2(int numberOfLines) {
		for(int i=1;i<=numberOfLines;i++) {
			for(int col=1;col<=numberOfLines-i+1;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern3(int numberOfLines) {
		for(int i=1;i<=numberOfLines;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	static void pattern4(int numberOfLines) {
		for(int i=1;i<=2*numberOfLines;i++) {
			int range = i<=numberOfLines ? i : (2*numberOfLines-i);
			for(int j=1;j<=range;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern5(int numberOfLines) {
		for(int i=1;i<=numberOfLines;i++) {
			for(int j=1;j<=numberOfLines;j++) {
				if(j>=numberOfLines-i+1)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

	static void pattern6(int numberOfLines) {
		for(int i=1;i<=numberOfLines;i++) {
			for(int j=1;j<=numberOfLines;j++) {
				if(j>=i)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void pattern7(int numberOfLines) {
		for(int i=1;i<=numberOfLines;i++) {
			for(int j=1;j<=2*numberOfLines-1;j++) {
				if(j>=numberOfLines-i+1 && j<=numberOfLines+i-1)
					System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	static void pattern8(int numberOfLines) {
		for(int i=1;i<=numberOfLines;i++) {
			for(int j=1;j<=2*numberOfLines-1;j++) {
					if(j>=i && j<=2*numberOfLines-1+1-i)
						System.out.print(" *");
					else
						System.out.print("  ");
			}
			System.out.println();
		}
	}

}
