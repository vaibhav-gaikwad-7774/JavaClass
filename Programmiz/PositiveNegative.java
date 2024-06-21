package Programmiz;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		System.out.println("Enter a Number which you want to check: ");
		Scanner sc = new Scanner (System.in);
	
		double a = sc.nextDouble();
		
		if (a<0.0)
			System.out.println(a + "Number is negetive");
		
		else if (a > 0.0)
			System.out.println(a + "Number is positive");
		
		else
			System.out.println(a+ "is 0");

	}

}
