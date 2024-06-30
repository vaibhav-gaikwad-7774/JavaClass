package Programmiz;

import java.util.Scanner;

public class PowerofNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a base: ");
		int base = sc.nextInt();
		System.out.println("Enter a exponent");
		int exponent = sc.nextInt();
		
		
		long result = 1;
		
		while (exponent != 0) {
			result *= base;
			--exponent;
		}
		
		System.out.println("Answer is: "+ result);

	}

}
