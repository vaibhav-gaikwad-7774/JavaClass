package StriverDSA;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("you are adult");
		}
		else
			System.out.println("you are not an adult");

	}

}
